package com.javaweb.dao;

import java.util.List;

import com.javaweb.models.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
    List<CategoryModel> findAll();
}
