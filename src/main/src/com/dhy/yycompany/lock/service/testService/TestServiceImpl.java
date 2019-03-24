package com.dhy.yycompany.lock.service.testService;

import com.dhy.yycompany.lock.bean.UserInfo;
import com.dhy.yycompany.lock.dao.UserInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public void getuser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        UserInfo userInfo = mapper.selectByPrimaryKey(21);
        sqlSession.close();
        System.out.println(userInfo.toString());
    }
}
