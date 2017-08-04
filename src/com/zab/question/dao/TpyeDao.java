package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.TypeExistException;
import com.zab.question.modle.DType;

/**
 * �������ݿ�����������  
 * �������ͣ� �����  ѡ���� ����� 
 * @author zhangaibin
 * һ���Ƿ�����д��������  
 */
public interface TpyeDao {
	/**
	 * ������������
	 * @param type   ����
	 * @throws TypeExistException  ����������׳����쳣
	 */
	void insertType(DType  type)throws TypeExistException;
	/***
	 * ����������������
	 * @return ���ͼ���
	 */
	List<DType> findAll();

}
