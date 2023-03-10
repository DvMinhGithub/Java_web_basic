package com.javaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.javaweb.models.NewModel;

public class NewMapper implements RowMapper<NewModel> {
    public NewModel mapRow(ResultSet resultSet) {
        try {
            NewModel news = new NewModel();
            news.setId(resultSet.getLong("id"));
            news.setTitle(resultSet.getString("title"));
            news.setContent(resultSet.getString("content"));
            news.setCategoryId(resultSet.getLong("categoryid"));
            news.setThumbnail(resultSet.getString("thumbnail"));
            news.setShortDescription(resultSet.getString("shortDescription"));
            news.setCreatedDate(resultSet.getTimestamp("createdDate"));
            news.setCreatedBy(resultSet.getString("createdBy"));
            if (resultSet.getTimestamp("modifiedDate") != null) {
                news.setModifiedDate(resultSet.getTimestamp("modifiedDate"));
            }
            if (resultSet.getString("modifiedBy") != null) {
                news.setModifiedBy(resultSet.getString("modifiedBy"));
            }
            return news;
        } catch (SQLException e) {
            return null;
        }
    }
}
