package com.zab.question.service;

import com.zab.question.exception.SAQuestionExistException;
import com.zab.question.modle.SAQuestion;

public interface SubjectService {
	/***
	 * ʵ�ֲ���һ������⹦��
	 * 
	 * @param question
	 * @return ����ɹ�����
	 */
	int insertSubject(SAQuestion question) throws SAQuestionExistException;
}
