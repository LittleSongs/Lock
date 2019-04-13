package com.dhy.yycompany.lock.service.FingerService;

import com.alibaba.fastjson.JSON;
import com.dhy.yycompany.lock.bean.FingerPrint;
import com.dhy.yycompany.lock.bean.FingerPrintExample;
import com.dhy.yycompany.lock.bean.Instruction;
import com.dhy.yycompany.lock.bean.InstructionExample;
import com.dhy.yycompany.lock.dao.FingerPrintMapper;
import com.dhy.yycompany.lock.dao.InstructionMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class FingerPrintServiceImpl implements FingerPrintService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public Map<String, Object> addFingerPrint(int u_id, int l_id, String fName, int process) {
        //等待完成
        Process ps = null;
        int status1 = 0;
        Map<String,Object> map =new HashMap<>();
        try {
            if (process == 1) {
                System.out.println("请按下指纹");
                Thread.sleep(3000);
                ps = Runtime.getRuntime().exec("python3 " + "/home/pi/Door/fingerSplit/getImage.py");
                status1 = ps.waitFor();//返回0为成功
                System.out.println(status1);
                System.out.println("第一次指纹录入完毕，放开手指");
                Thread.sleep(3000);

                ps = Runtime.getRuntime().exec("python3 " + "/home/pi/Door/fingerSplit/ganchar_1.py");
                status1 = ps.waitFor();//返回0为成功
                System.out.println(status1);
                if(status1==0){
                    map.put("result",0);
                    map.put("detail","第一次指纹录入成功");
                }else{
                    map.put("result",1);
                    map.put("detail","第一次指纹录入失败");
                }

            } else if (process == 2) {
                System.out.println("请再次按下指纹");
                Thread.sleep(3000);
                ps = Runtime.getRuntime().exec("python3 " + "/home/pi/Door/fingerSplit/getImage.py");
                status1 = ps.waitFor();//返回0为成功
                System.out.println(status1);
                System.out.println("第二次指纹录入完毕，放开手指");
                Thread.sleep(3000);
                ps = Runtime.getRuntime().exec("python3 " + "/home/pi/Door/fingerSplit/ganchar_2.py");
                status1 = ps.waitFor();//返回0为成功
                System.out.println(status1);

                ps = Runtime.getRuntime().exec("python3 " + "/home/pi/Door/fingerSplit/regmodel.py");
                status1 = ps.waitFor();//返回0为成功
                System.out.println(status1);

                //创建指纹目录
                //String path1 = System.getProperty("evan.webapp");
                //System.out.println("path1=="+path1);
                //String path1 = this.getClass().getClassLoader().getResource("./finger/").getPath();
                String path = "/imagesA/" + l_id + "/" + u_id;
                String pathLockUser = l_id + "/" + u_id + "/";
                System.out.println("path=" + path);
                File file = new File(path);
                Boolean bbc = file.mkdirs();// ture

                String position1 = "";

                try {
                    String[] args = new String[]{"python3", "/home/pi/Door/fingerSplit/ValidTemple.py", path};
                    ps = Runtime.getRuntime().exec(args);

                    //Process process = Runtime.getRuntime().exec("python3 ValidTemple.py",path);
//            process.waitFor();
                    InputStreamReader ir = new InputStreamReader(ps.getInputStream());
                    LineNumberReader input = new LineNumberReader(ir);
                    String str = "";
                    while ((str = input.readLine()) != null) {
                        System.out.println("result==" + str);
                        position1 = str;
                    }
//            result = input.readLine();
//            System.out.println("result=="+result);
                    status1 = ps.waitFor();//返回0为成功
                    System.out.println(status1);
                    input.close();
                    ir.close();
//            process.waitFor();
                } catch (IOException e) {
                    //logger.error("调用python脚本并读取结果时出错：" + e.getMessage());
                    e.printStackTrace();
                }
//            //调用ValidTemple.py 获取当前的指纹数量,并保存到指纹模块
//            ps = Runtime.getRuntime().exec("python3 "+ "ValidTemple.py");
//            status1 = ps.waitFor();//返回0为成功
//            System.out.println(status1);

                //生成指纹完整路径
                System.out.println("position1=" + position1);
                String fingerContent = path + "/" + position1;
                System.out.println("fingerContent=" + fingerContent);
                //生成uuid
                String uuid = "";
                uuid = UUID.randomUUID().toString().replaceAll("-", "");
                System.out.println(uuid);


                //把指纹信息保存到数据库
                //。。。。。。。。。。。。。。。。。。。
                // 1.加载数据访问驱动
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //2.连接到数据"库"上去
//            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/lock?characterEncoding=UTF-8", "root", "123456");
//            //3.构建SQL命令
//            Statement state=conn.createStatement();
//            String s="insert into fingerprint" +
//                    "(f_uuid,f_name,f_lock_id,f_user_id,f_content_path,f_delete,f_is_modify) " +
//                    "VALUES('"+uuid+"','"+uuid+"',"+l_id+","+u_id+",'"+fingerContent+"',"+0+","+0+")";
//            System.out.println("sql命令:"+s);
//            state.executeUpdate(s);
//            conn.close();//关闭连接

                SqlSession sqlSession = sqlSessionFactory.openSession();
                FingerPrint fp = new FingerPrint();
                fp.setfContentPath(fingerContent);
                fp.setfLockId(l_id);
                fp.setfName(fName);
                fp.setfUserId(Integer.valueOf(u_id));
                fp.setfDelete(0);
                fp.setfIsModify(0);
                fp.setfUuid(uuid);
                fp.setfId(null);
                FingerPrintMapper fingerPrintMapper = sqlSession.getMapper(FingerPrintMapper.class);

                int num1 = fingerPrintMapper.insert(fp);
                if (num1 == 1) {
                    System.out.println("添加指纹成功");
                } else {
                    System.out.println("添加指纹失败");
                }


                System.out.println("fingerPrint=" + fp);


                InstructionMapper instructionMapper = sqlSession.getMapper(InstructionMapper.class);

                Instruction instruction = new Instruction();
                instruction.setiUuid(UUID.randomUUID().toString().replaceAll("-", ""));
                instruction.setiLockId(l_id);
                instruction.setiUserId(u_id);
                instruction.setiIsDelete(0);
                instruction.setiIsModify(1);
                instruction.setiIsUser(0);
                instruction.setiIsLock(0);
                instruction.setiIsKey(0);
                instruction.setiIsFinger(1);
                instruction.setiUserInfo("");
                instruction.setiLockInfo("");
                instruction.setiKeyInfo("");
                instruction.setiFingerInfo("{\"result\":\"ok\",\"fName\":\"" + position1 + ".FBI\",\"method\":\"addFingerFile\",\"path\":\"" + pathLockUser + "\"}");
                int num = instructionMapper.insert(instruction);
                if (num == 1) {
                    System.out.println("添加指令成功");
                } else {
                    System.out.println("添加指令失败");
                }
                if(status1==0){
                    map.put("result",0);
                    map.put("detail","第二次指纹录入成功");
                }else{
                    map.put("result",1);
                    map.put("detail","第二次指纹录入失败");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return map;
    }
}
