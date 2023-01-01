package com.example.keshe.controller;

import cn.hutool.json.JSONUtil;
import com.example.keshe.entity.User;
import com.example.keshe.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Resource
    UserMapper userMapper;

    @GetMapping("/user")
    public String query(){
        List<User> users = userMapper.selectList(null);
        return JSONUtil.toJsonStr(users);
    }
}
