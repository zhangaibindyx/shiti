package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.CategoryExistException;
import com.zab.question.exception.CategoryNotExistException;
import com.zab.question.modle.Category;

/**
 *ʵ�ֶ�����������ɾ�Ĳ� 
 *
 */
public interface CategoryDao {
	/**
	 * ʵ����������������
	 * @param category ������ ���� java android �ȵ�
	 * @throws CategoryExistException ����Ѵ����׳����쳣
	 */
	void insertCategorty(Category category)throws CategoryExistException;
	
	/**
	 * ��������������
	 * @return �����󼯺�
	 */
	List<Category> findAll();

/**
 * ɾ��ָ����������
 * @param category ɾ�������Ͷ���
 * @throws CategoryNotExistException ��������� ���׳����쳣
 */
	void deleteCategorty(Category category)throws CategoryNotExistException;

}
