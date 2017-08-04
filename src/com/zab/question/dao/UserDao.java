package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.NameErrorException;
import com.zab.question.exception.NameExistException;
import com.zab.question.exception.PassWordErrorException;
import com.zab.question.modle.User;

/***
 * 实现对用户的登录 注册 修改密码 删除用户功能
 * 
 * @author zhangaibin
 *
 */
public interface UserDao {
	/**
	 * 注册业务
	 * 
	 * @param name
	 *            账号
	 * @param pwd
	 *            密码
	 * @return
	 * @throws NameExistException
	 *             账号已存在抛出此异常
	 */
	User regist(String name, String pwd) throws NameExistException;

	/**
	 * 查找数据库中是否已存在name，配合regist使用
	 * 
	 * @param name
	 *            注册的账号
	 * @return 如果有返回name 否则返回null
	 */
	List<String> findUserName(String name);

	/***
	 * 实现登录功能
	 * 
	 * @param name
	 *            账号
	 * @param pwd
	 *            密码
	 * @return 登录成功后返回用户对象
	 * @throws NameErrorException
	 *             账号错误
	 * @throws PassWordErrorException
	 *             密码错误
	 */
	User login(String name, String pwd) throws NameErrorException,
			PassWordErrorException;

	/**
	 * 修改密码业务
	 * 
	 * @param name账号
	 * @param oldPwd
	 *            旧密码
	 * @param newPwd
	 *            新密码
	 * @return 修改是否成功
	 * @throws NameErrorException
	 *             账号不存在
	 * @throws PassWordErrorException
	 *             密码旧密码错误
	 */
	int updataPassWord(String name, String oldPwd, String newPwd)
			throws NameErrorException, PassWordErrorException;
/**
 * 通过用户名查找密码
 * @param name  用户名
 * @return 密码
 */
	String findPwdByName(String name);
	
	
	
}
