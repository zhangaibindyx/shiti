package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.ChoiceQuestionExistException;
import com.zab.question.exception.SAQuestionExistException;
import com.zab.question.exception.SAQuestionNotExistException;
import com.zab.question.modle.ChoiceQuestion;
import com.zab.question.modle.SAQuestion;

/***
 * ���������ɾ�Ĳ鹦��
 * 
 * @author zhangaibin
 * 
 */
public interface SubjectDao {
	// ////////////////�����//////////////////////////////////////////
	/**
	 * ʵ�����һ�����������
	 * 
	 * @param question
	 * @throws SAQuestionExistException
	 */
	int insertSubject(SAQuestion question) throws SAQuestionExistException;

	/**
	 * ʵ��ɾ��һ���������ݣ�����Ԥ�� ��������
	 * ֻ�ṩ�������û�
	 * @param question �������
	 * @throws SAQuestionNotExistException ���û���ҵ� ���׳����쳣
	 */

	void deleteSubject(SAQuestion question) throws SAQuestionNotExistException;
   /**
    * ʵ���޸����⹦��
    * @param question  
    * @throws SAQuestionNotExistException ���û�ҵ� ���׳����쳣
    */
	void updateSubject(SAQuestion question)throws SAQuestionNotExistException ;
	
	/**
	 * ��ѯ����� ��pageҳ ÿһҳnumber����
	 * @param page �ڼ�ҳ
	 * @param number ÿһҳ���� ��Ĭ��30����
	 * @return ���ز�ѯ��������
	 */
	List<SAQuestion> findSAQuestions(int page,int number);
	
    /***
     * 
     * @param type java 1 android 2 IOS 3  �ȵ�
     * @param page �ڼ�ҳ
     * @param numberÿҳ����
     * @return ��Ӧ�ļ��������
     */
	List<SAQuestion> findSAQuestionsByType(int type, int page,int number);
	
	/**
	 * ͨ���������ʵ����ӹ���
	 * @param title
	 * @return
	 * @throws SAQuestionExistException
	 */
	List<SAQuestion>findSAQuestionByTitle(String title)throws SAQuestionExistException;
	
	
	
	
	
	
	
	
	
/////////////////////ѡ����/////////////////////////////////////
	/**
	 * ���ѡ���⹦��ʵ��
	 * @param question ѡ�������
	 * @throws ChoiceQuestionExistException ����Ѵ������׳����쳣
	 */
	void insertChoiceQuestion(ChoiceQuestion question)throws ChoiceQuestionExistException;
	
	
	
	
	
	
	
	
	
}
