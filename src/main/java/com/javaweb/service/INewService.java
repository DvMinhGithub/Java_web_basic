package com.javaweb.service;

import java.util.List;

import com.javaweb.models.NewModel;

public interface INewService {
    
    List<NewModel> findByCategoryId(Long categoryId);
    
	NewModel save(NewModel newModel);
}
