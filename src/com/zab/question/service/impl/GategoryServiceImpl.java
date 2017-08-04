package com.zab.question.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zab.question.dao.CategoryDao;
import com.zab.question.modle.Category;
import com.zab.question.service.GategoryServcie;

@Service("gategoryServie")
public class GategoryServiceImpl implements GategoryServcie {
	@Resource
	private CategoryDao categoryDao;

	@Override
	public List<Category> findAll() {
		List<Category> data = categoryDao.findAll();
		return data;
	}

	public CategoryDao getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

}
