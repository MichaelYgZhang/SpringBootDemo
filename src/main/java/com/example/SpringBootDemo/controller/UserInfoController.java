package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.bean.UserInfo;
import com.example.SpringBootDemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/userInfoList")
    public List<UserInfo> userInfoList() {
        return userInfoService.findAll();
    }
}
