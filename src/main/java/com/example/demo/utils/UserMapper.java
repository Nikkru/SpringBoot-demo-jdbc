package com.example.demo.utils;

import com.example.demo.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
//        user.getId(rs.getInt("id"));
//        user.getFirstName(rs.getString("firstName"));
//        user.getFirstName(rs.getString("lastName"));
        return user;
    }
}
