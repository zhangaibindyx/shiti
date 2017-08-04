package com.zab.question.service;

import com.zab.question.exception.SAQuestionExistException;
import com.zab.question.modle.SAQuestion;

public interface SubjectService {
	/***
	 * 实现插入一条简答题功能
	 * 
	 * @param question
	 * @return 插入成功条数
	 */
	int insertSubject(SAQuestion question) throws SAQuestionExistException;
}
