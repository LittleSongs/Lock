package com.dhy.yycompany.lock.service.AdminService;

import com.dhy.yycompany.lock.bean.Administrator;
import com.dhy.yycompany.lock.bean.AdministratorExample;
import com.dhy.yycompany.lock.bean.KeyInfo;
import com.dhy.yycompany.lock.dao.AdministratorMapper;
import com.dhy.yycompany.lock.dao.KeyInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
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
}
