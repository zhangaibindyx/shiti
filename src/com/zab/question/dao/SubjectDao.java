package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.ChoiceQuestionExistException;
import com.zab.question.exception.SAQuestionExistException;
import com.zab.question.exception.SAQuestionNotExistException;
import com.zab.question.modle.ChoiceQuestion;
import com.zab.question.modle.SAQuestion;

/***
 * 对试题的增删改查功能
 * 
 * @author zhangaibin
 * 
 */
public interface SubjectDao {
	// ////////////////简答题//////////////////////////////////////////
	/**
	 * 实现添加一条简答题数据
	 * 
	 * @param question
	 * @throws SAQuestionExistException
	 */
	int insertSubject(SAQuestion question) throws SAQuestionExistException;

	/**
	 * 实现删除一条问题数据，仅供预留 不做操作
	 * 只提供给超级用户
	 * @param question 问题对象
	 * @throws SAQuestionNotExistException 如果没有找的 则抛出此异常
	 */

	void deleteSubject(SAQuestion question) throws SAQuestionNotExistException;
   /**
    * 实现修改问题功能
    * @param question  
    * @throws SAQuestionNotExistException 如果没找到 则抛出此异常
    */
	void updateSubject(SAQuestion question)throws SAQuestionNotExistException ;
	
	/**
	 * 查询简答题 第page页 每一页number道题
	 * @param page 第几页
	 * @param number 每一页数量 （默认30条）
	 * @return 返回查询到的数据
	 */
	List<SAQuestion> findSAQuestions(int page,int number);
	
    /***
     * 
     * @param type java 1 android 2 IOS 3  等等
     * @param page 第几页
     * @param number每页条数
     * @return 对应的简答题数据
     */
	List<SAQuestion> findSAQuestionsByType(int type, int page,int number);
	
	/**
	 * 通过问题标题实现添加功能
	 * @param title
	 * @return
	 * @throws SAQuestionExistException
	 */
	List<SAQuestion>findSAQuestionByTitle(String title)throws SAQuestionExistException;
	
	
	
	
	
	
	
	
	
/////////////////////选择题/////////////////////////////////////
	/**
	 * 添加选择题功能实现
	 * @param question 选择题对象
	 * @throws ChoiceQuestionExistException 如果已存在则抛出此异常
	 */
	void insertChoiceQuestion(ChoiceQuestion question)throws ChoiceQuestionExistException;
	
	
	
	
	
	
	
	
	
}
