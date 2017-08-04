package com.zab.question.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.zab.question.dao.SubjectDao;
import com.zab.question.exception.SAQuestionExistException;
import com.zab.question.modle.SAQuestion;
import com.zab.question.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Resource
	private SubjectDao subjectDao;

	public SubjectDao getSubjectDao() {
		return subjectDao;
	}

	public void setSubjectDao(SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}

	@Override
	public int insertSubject(SAQuestion question)
			throws SAQuestionExistException {
		int n = subjectDao.insertSubject(question);
		return n;
	}

}
