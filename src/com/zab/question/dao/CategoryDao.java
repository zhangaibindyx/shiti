package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.CategoryExistException;
import com.zab.question.exception.CategoryNotExistException;
import com.zab.question.modle.Category;

/**
 *实现对试题类别的增删改查 
 *
 */
public interface CategoryDao {
	/**
	 * 实现添加试题类别数据
	 * @param category 类别对象 例如 java android 等等
	 * @throws CategoryExistException 如果已存在抛出此异常
	 */
	void insertCategorty(Category category)throws CategoryExistException;
	
	/**
	 * 查找所有类别对象
	 * @return 类别对象集合
	 */
	List<Category> findAll();

/**
 * 删除指定类型数据
 * @param category 删除的类型对象
 * @throws CategoryNotExistException 如果不存在 则抛出此异常
 */
	void deleteCategorty(Category category)throws CategoryNotExistException;

}
