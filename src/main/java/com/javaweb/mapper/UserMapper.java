package com.javaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.javaweb.models.RoleModel;
import com.javaweb.models.UserModel;

public class UserMapper implements RowMapper<UserModel> {

    @Override
    public UserModel mapRow(ResultSet rs) {
        try {
            UserModel user = new UserModel();
            user.setId(rs.getLong("id"));
            user.setUserName(rs.getString("userName"));
            user.setFullName(rs.getString("fullName"));
            user.setPassword(rs.getString("password"));
            user.setStatus(rs.getInt("status"));
            try {
                RoleModel role = new RoleModel();
                role.setCode(rs.getString("code"));
                role.setName(rs.getString("name"));
                user.setRole(role);
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
            return user;
        } catch (SQLException e) {
            return null;
        }
    }

}
