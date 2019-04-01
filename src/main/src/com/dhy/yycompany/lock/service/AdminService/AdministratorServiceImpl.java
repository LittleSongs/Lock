package com.dhy.yycompany.lock.service.AdminService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dhy.yycompany.lock.bean.*;
import com.dhy.yycompany.lock.dao.AdministratorMapper;
import com.dhy.yycompany.lock.dao.KeyAndAdminMapper;
import com.dhy.yycompany.lock.dao.KeyInfoMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int addkey(Map<String ,String> map) {
        KeyInfo keyInfo=new KeyInfo();
        keyInfo.setkUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        keyInfo.setkLockId(Integer.valueOf(map.get("LockID")));
        keyInfo.setkUserId(Integer.parseInt(map.get("UserID")));
        keyInfo.setkPassword(map.get("Password"));
        keyInfo.setkAvailableTimes(Integer.valueOf(map.get("AvailableTimes")));
        keyInfo.setkFailureTime(map.get("FailureTime"));
        keyInfo.setkIsModify(1);
        keyInfo.setkDelete(0);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        KeyInfoMapper keyInfoMapper=sqlSession.getMapper(KeyInfoMapper.class);
        int num=keyInfoMapper.insert(keyInfo);
        if(num==1){
            System.out.println("添加密码成功");
            return 0;
        }else{
            System.out.println("添加密码失败");
            return 1;
        }
    }

    @Override
    public Map<String, String> modifyAdminInfo(int adminID, String password, String newName) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AdministratorMapper administratorMapper=sqlSession.getMapper(AdministratorMapper.class);
        Administrator administrator=new Administrator();
        administrator.setAdminId(adminID);
        administrator.setAdminPassword(password);
        administrator.setAdminName(newName);
        int num=administratorMapper.updateByPrimaryKeySelective(administrator);
        System.out.println("修改了管理员"+num+"条信息");
        Map<String, String> map=new HashMap<>();
        if(num==1){
            map.put("result", "0");
            map.put("message", "修改管理员成功");
        }else{
            map.put("result", "1");
            map.put("message", "修改管理员失败");
        }

        return map;
    }

    @Override
    public JSON getInfo(int adminID) {
        AdministratorExample administratorExample=new AdministratorExample();
        AdministratorExample.Criteria criteria=administratorExample.createCriteria();
        criteria.andAdminIdEqualTo(adminID);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AdministratorMapper administratorMapper=sqlSession.getMapper(AdministratorMapper.class);
        Administrator administrator=administratorMapper.selectByPrimaryKey(adminID);
        System.out.println("administrator="+administrator);
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSON(administrator).toString());
        System.out.println("000="+jsonObject);
        return jsonObject;
    }

    @Override
    public JSON getInfos(int adminID, int pageNum) {
        AdministratorExample administratorExample=new AdministratorExample();
        AdministratorExample.Criteria criteria=administratorExample.createCriteria();
        criteria.andAdminIdNotEqualTo(adminID);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        PageHelper.startPage(pageNum, 5);
        AdministratorMapper administratorMapper=sqlSession.getMapper(AdministratorMapper.class);
        List<Administrator> administratorList=administratorMapper.selectByExample(administratorExample);
        System.out.println("administratorList="+administratorList);


        Page<Administrator> listCountry = (Page<Administrator>) administratorList;
        int pages = listCountry.getPages();//administratorList
        int pageNum1 = listCountry.getPageNum();//当前页
        long total = listCountry.getTotal();//总数据数
        System.out.println(listCountry.getTotal());
        System.out.println(listCountry.toString());
        HashMap<String, Object> messages = new HashMap<>();
        HashMap<String, Object> pageHelperMessage = new HashMap<>();
        pageHelperMessage.put("pageNum", pageNum1);
        pageHelperMessage.put("pages", pages);
        pageHelperMessage.put("total", total);
        messages.put("pageHelperMessage", pageHelperMessage);
        JSON toJSON = (JSON) JSONArray.toJSON(administratorList);
        messages.put("administratorList", toJSON);
        JSONObject json = new JSONObject(messages);
        System.out.println("000="+json);
        return json;
    }

    @Override
    public Map<String, String> deleteAdmin(int adminID) {
        Administrator administrator=new Administrator();
        administrator.setAdminId(adminID);
        administrator.setAdminDelete(1);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AdministratorMapper administratorMapper=sqlSession.getMapper(AdministratorMapper.class);
        //把administrator表中的delete置1
        int num=administratorMapper.updateByPrimaryKeySelective(administrator);
        Map<String, String> map = new HashMap<>();
        if(num==1){
            //管理员删除成功
            KeyAndAdminExample keyAndAdminExample=new KeyAndAdminExample();
            KeyAndAdminExample.Criteria criteria=keyAndAdminExample.createCriteria();
            criteria.andAdminIdEqualTo(adminID);
            KeyAndAdminMapper keyAndAdminMapper=sqlSession.getMapper(KeyAndAdminMapper.class);
            List<KeyAndAdmin> keyAndAdminList = keyAndAdminMapper.selectByExample(keyAndAdminExample);
            System.out.println("keyAndAdminList="+keyAndAdminList);
            if(keyAndAdminList!=null && keyAndAdminList.size()!=0){
                KeyInfoExample keyInfoExample=new KeyInfoExample();
                KeyInfoExample.Criteria criteria1=keyInfoExample.createCriteria();
                System.out.println("userid="+keyAndAdminList.get(0).getUserId());
                criteria1.andKUserIdEqualTo(keyAndAdminList.get(0).getUserId());
                KeyInfo keyinfo=new KeyInfo();
                keyinfo.setkDelete(1);
                KeyInfoMapper keyInfoMapper=sqlSession.getMapper(KeyInfoMapper.class);
                int num1=keyInfoMapper.updateByExampleSelective(keyinfo,keyInfoExample);
                System.out.println("num1="+num1);
                if(num1>0){
                    //删除管理员创建的密码成功
                    System.out.println("删除管理员创建的密码成功");
                    map.put("result", "0");
                    map.put("message", "删除管理员成功");
                }
            }
        }else{
            //管理员删除失败
            System.out.println("管理员删除失败");
            map.put("result", "1");
            map.put("message", "删除管理员失败");
        }

        return map;
    }
}
