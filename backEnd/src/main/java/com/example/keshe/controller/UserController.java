package com.example.keshe.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.example.keshe.entity.User;
import com.example.keshe.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    UserMapper userMapper;

    @PostMapping("/login")
    @CrossOrigin
    public String login(@RequestBody Map reqData){
        String userName = String.valueOf(reqData.get("userName"));
        String pwd = String.valueOf(reqData.get("pwd"));

        HashMap<String, Object> map = new HashMap<>();
        map.put("user_name",userName);
        List<User> users = userMapper.selectByMap(map);
        if(users.size()==0){
            return "用户名错误！";
        }
        User user = users.get(0);
        if(user.getPwd().equals(pwd)){
            return "成功";
        }else{
            return "密码错误！";
        }
    }
}
