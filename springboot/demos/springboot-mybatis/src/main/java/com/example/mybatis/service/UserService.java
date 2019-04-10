package com.example.mybatis.service;

import com.example.mybatis.dao.mapper.UserDao;
import com.example.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User Sel(int id){
        return userDao.Sel(id);
    }

    public boolean addUser(User record){
        boolean result = false;
        try {
            userDao.insert(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}