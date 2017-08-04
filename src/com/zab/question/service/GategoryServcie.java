package com.zab.question.service;

import java.util.List;

import com.zab.question.modle.Category;

/**
 * 实现对试题类别的增删改查 
 * @author zhangaibin
 *
 */
public interface GategoryServcie {
	/**
	 * 查询所有类别信息
	 * @return  返回所有类别数据
	 */
     List<Category> findAll();
	
	
}	
