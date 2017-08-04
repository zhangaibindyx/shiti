package com.zab.question.dao;

import java.util.List;

import com.zab.question.exception.NameErrorException;
import com.zab.question.exception.NameExistException;
import com.zab.question.exception.PassWordErrorException;
import com.zab.question.modle.User;

/***
 * ʵ�ֶ��û��ĵ�¼ ע�� �޸����� ɾ���û�����
 * 
 * @author zhangaibin
 *
 */
public interface UserDao {
	/**
	 * ע��ҵ��
	 * 
	 * @param name
	 *            �˺�
	 * @param pwd
	 *            ����
	 * @return
	 * @throws NameExistException
	 *             �˺��Ѵ����׳����쳣
	 */
	User regist(String name, String pwd) throws NameExistException;

	/**
	 * �������ݿ����Ƿ��Ѵ���name�����registʹ��
	 * 
	 * @param name
	 *            ע����˺�
	 * @return ����з���name ���򷵻�null
	 */
	List<String> findUserName(String name);

	/***
	 * ʵ�ֵ�¼����
	 * 
	 * @param name
	 *            �˺�
	 * @param pwd
	 *            ����
	 * @return ��¼�ɹ��󷵻��û�����
	 * @throws NameErrorException
	 *             �˺Ŵ���
	 * @throws PassWordErrorException
	 *             �������
	 */
	User login(String name, String pwd) throws NameErrorException,
			PassWordErrorException;

	/**
	 * �޸�����ҵ��
	 * 
	 * @param name�˺�
	 * @param oldPwd
	 *            ������
	 * @param newPwd
	 *            ������
	 * @return �޸��Ƿ�ɹ�
	 * @throws NameErrorException
	 *             �˺Ų�����
	 * @throws PassWordErrorException
	 *             ������������
	 */
	int updataPassWord(String name, String oldPwd, String newPwd)
			throws NameErrorException, PassWordErrorException;
/**
 * ͨ���û�����������
 * @param name  �û���
 * @return ����
 */
	String findPwdByName(String name);
	
	
	
}
