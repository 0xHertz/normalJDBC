package com.kechen.service;

import com.kechen.dao.ListUsersDao;
import com.kechen.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// 使用注释将这个类实例化
@Service
public class ListUser {
    // 使用刚刚实例化的Dao类
    @Autowired
    private ListUsersDao listUsersDao;
    public List<User> list(){
        // 这里还可以加一些处理逻辑
        return listUsersDao.list();
    }
}
