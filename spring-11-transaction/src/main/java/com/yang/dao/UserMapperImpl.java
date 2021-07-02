package com.yang.dao;

import com.yang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public List<User> selectUser() {
        User tangshan = new User(6, "Tangshan", "17278267");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(tangshan);
        mapper.deleteUser(5);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}