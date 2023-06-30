package com.kechen.dao;

import com.kechen.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

// 使用注释将这个类实例化
@Repository
public class ListUsersDao {

    // 因为我们在configOne中实例化了jabcTemplate类，所以可以@AutoWired
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> list(){
        String sql = "select * from t_users";
        return jdbcTemplate.query(sql,new Object[]{}, new BeanPropertyRowMapper<User>(User.class));
    }
}
