package com.zab.question.service;

import com.zab.question.exception.NameErrorException;
import com.zab.question.exception.NameExistException;
import com.zab.question.exception.PassWordErrorException;
import com.zab.question.modle.User;

public interface UserService {
	/**
	 * ʵ�ֵ�¼����
	 * @param name �˺�
	 * @param pwd ����
	 * @return ��¼���ܷ��ص�json����
	 */
	User login(String name,String pwd)throws NameErrorException,PassWordErrorException;
	
	/**
	 * ע�Ṧ��ʵ��
	 * @param name �˺�
	 * @param pwd ����
	 * @return ע�Ṧ�ܷ��ص�json����
	 */
	User regist(String name,String pwd)throws NameExistException;
	/***
	 * �޸�����ҵ��
	 * @param name �˺�
	 * @param oldPwd ����
	 * @param newPwd
	 * @return �޸��ܴa�󷵻ص�json����
	 */
	int updataPassWord(String name,String oldPwd,String newPwd)throws NameErrorException,PassWordErrorException;
}
