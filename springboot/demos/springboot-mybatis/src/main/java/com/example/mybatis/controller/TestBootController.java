package com.example.mybatis.controller;

import com.example.mybatis.entity.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/spboot")
public class TestBootController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    @RequestMapping("/addUser")
    public void addUser(){
        User user = new User();
        user.setPassWord("124");
        user.setUserName("qwqw");
        user.setRealName("qqqq");
        userService.addUser(user);
    }
}