package com.javaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.javaweb.dao.INewDAO;
import com.javaweb.models.NewModel;
import com.javaweb.service.INewService;

public class NewService implements INewService {
    
    @Inject
    private INewDAO newDao;

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		return newDao.findByCategoryId(categoryId);
	}

	@Override
	public NewModel save(NewModel newModel) {
		Long newId = newDao.save(newModel);
		return newDao.findOne(newId);
	}
}
