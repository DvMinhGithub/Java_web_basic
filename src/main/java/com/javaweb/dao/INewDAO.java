package com.javaweb.dao;

import java.util.List;

import com.javaweb.models.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {

	List<NewModel> findByCategoryId(Long categoryId);

	NewModel findOne(Long id);

	Long save(NewModel newModel);
	// void update(NewModel updateNew);
	// void delete(long id);
	// int getTotalItem();
}
