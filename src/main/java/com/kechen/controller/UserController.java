package com.kechen.controller;

import com.kechen.dao.ListUsersDao;
import com.kechen.pojo.User;
import com.kechen.service.ListUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
// 使用注释将该类实例化
@Controller
public class UserController {
    // 使用刚刚是实例化的Service对象
    @Autowired
    private ListUser listUser;

    // 该方法返回数据，而不是跳转页面，因此使用@ResponseBody进行实例化
    @ResponseBody
    public List<User> getUsers(){
        return listUser.list();
    }
}
