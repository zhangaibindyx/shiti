package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.TypeExistException;
import com.zab.question.modle.DType;

/**
 * 操作数据库中试题类型  
 * 试题类型： 简答题  选择题 填空题 
 * @author zhangaibin
 * 一般是服务器写死的类型  
 */
public interface TpyeDao {
	/**
	 * 插入试题类型
	 * @param type   类型
	 * @throws TypeExistException  如果存在则抛出此异常
	 */
	void insertType(DType  type)throws TypeExistException;
	/***
	 * 查找所有类型数据
	 * @return 类型集合
	 */
	List<DType> findAll();

}
