package com.example.demo.comtroller;

import com.example.demo.bean.TUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    UserMapper userMapper;
    @GetMapping("/user/{id}")
    public TUser getUer(@PathVariable("id") Long id)
    {
        TUser user = userMapper.getUserById(id);
        return user;
    }
}