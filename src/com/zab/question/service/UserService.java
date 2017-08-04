package com.zab.question.service;

import com.zab.question.exception.NameErrorException;
import com.zab.question.exception.NameExistException;
import com.zab.question.exception.PassWordErrorException;
import com.zab.question.modle.User;

public interface UserService {
	/**
	 * 实现登录功能
	 * @param name 账号
	 * @param pwd 密码
	 * @return 登录功能返回的json数据
	 */
	User login(String name,String pwd)throws NameErrorException,PassWordErrorException;
	
	/**
	 * 注册功能实现
	 * @param name 账号
	 * @param pwd 密码
	 * @return 注册功能返回的json数据
	 */
	User regist(String name,String pwd)throws NameExistException;
	/***
	 * 修改密码业务
	 * @param name 账号
	 * @param oldPwd 密码
	 * @param newPwd
	 * @return 修改密碼后返回的json數據
	 */
	int updataPassWord(String name,String oldPwd,String newPwd)throws NameErrorException,PassWordErrorException;
}
