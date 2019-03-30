package com.dhy.yycompany.lock.service.AdminService;

import com.dhy.yycompany.lock.bean.KeyInfo;
import com.dhy.yycompany.lock.dao.KeyInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
