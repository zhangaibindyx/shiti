package com.zab.question.service;

import java.util.List;

import com.zab.question.modle.Category;

/**
 * ʵ�ֶ�����������ɾ�Ĳ� 
 * @author zhangaibin
 *
 */
public interface GategoryServcie {
	/**
	 * ��ѯ���������Ϣ
	 * @return  ���������������
	 */
     List<Category> findAll();
	
	
}	
