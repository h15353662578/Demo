package com.hs.user.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.hs.entity.User;
import com.hs.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @GetMapping(value = "/findAll")
    @SentinelResource("findAll")
    public List<User>findAll(){
        return userService.findAll();
    }

    @GetMapping(value = "/findAll2")
    @SentinelResource("findAll2")
    public List<User>findAll2(){
        return userService.findAll();
    }
}
