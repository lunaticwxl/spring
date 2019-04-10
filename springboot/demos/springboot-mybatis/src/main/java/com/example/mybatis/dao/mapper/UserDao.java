package com.example.mybatis.dao.mapper;

import com.example.mybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User Sel(int id);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

//    int insertSelective(User record);

//    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}