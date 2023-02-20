package com.javaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import com.javaweb.dao.ICategoryDAO;
import com.javaweb.mapper.CategoryMapper;
import com.javaweb.models.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	public Connection getConnection() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
		try {
			Class.forName(resourceBundle.getString("driverName"));
			String url = resourceBundle.getString("url");
			String user = resourceBundle.getString("user");
			String password = resourceBundle.getString("password");
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
		/*List<CategoryModel> results = new ArrayList<>();
		String sql = "SELECT * FROM category";
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultset = null;
		if (connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultset = statement.executeQuery();
				while (resultset.next()) {
					CategoryModel categoryModel = new CategoryModel();
					categoryModel.setId(resultset.getLong("id"));
					categoryModel.setCode(resultset.getString("code"));
					categoryModel.setName(resultset.getString("name"));
					results.add(categoryModel);
				}
				return results;
			} catch (SQLException e) {
				return null;
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultset != null) {
						resultset.close();
					}
				} catch (SQLException e) {
					return null;
				}
			}
		}
		return null; */
	}

}
