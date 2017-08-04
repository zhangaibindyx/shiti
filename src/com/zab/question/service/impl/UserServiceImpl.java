package com.zab.question.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zab.question.dao.UserDao;
import com.zab.question.dao.impl.UserDaoImpl;
import com.zab.question.exception.NameErrorException;
import com.zab.question.exception.NameExistException;
import com.zab.question.exception.PassWordErrorException;
import com.zab.question.modle.User;
import com.zab.question.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(String name, String pwd)throws NameErrorException,PassWordErrorException {
		User u=userDao.login(name, pwd);
		return u;
	}

	@Override
	public User regist(String name, String pwd)throws NameExistException {
		// TODO Auto-generated method stub
		return userDao.regist(name, pwd);
	}

	@Override
	public int updataPassWord(String name, String oldPwd, String newPwd)
			throws NameErrorException, PassWordErrorException {


		return userDao.updataPassWord(name, oldPwd, newPwd);
	}

}
