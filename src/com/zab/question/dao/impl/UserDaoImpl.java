package com.zab.question.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zab.question.dao.UserDao;
import com.zab.question.exception.NameErrorException;
import com.zab.question.exception.NameExistException;
import com.zab.question.exception.PassWordErrorException;
import com.zab.question.modle.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public User regist(String name, String pwd) throws NameExistException {
		List<String> nameData = findUserName(name);
		if (nameData.size() != 0) {
			throw new NameExistException();
		}
		String sql = "insert into d_user (u_name,u_password) values(?,?);";
		jdbcTemplate.update(sql, new Object[] { name, pwd }, new int[] {
				Types.VARCHAR, Types.VARCHAR });
		User u = new User();
		u.setU_name(name);
		return u;
	}

	@Override
	public List<String> findUserName(String name) {
		String sql = "select u_name from d_user where u_name= ?";

		List<String> list = jdbcTemplate.queryForList(sql,
				new Object[] { name }, new int[] { Types.VARCHAR },
				String.class);
		return list;
	}

	@Override
	public User login(String name, String pwd) throws NameErrorException,
			PassWordErrorException {
		List<String> nameData = findUserName(name);
		if (nameData.size() == 0) {
			throw new NameErrorException();
		}
		String sql = "select u_password from d_user where u_name= ?";
		String pwdData = jdbcTemplate.queryForObject(sql,
				new Object[] { name }, new int[] { Types.VARCHAR },
				new RowMapper<String>() {
					public String mapRow(ResultSet arg0, int arg1)
							throws SQLException {
						String pwd = arg0.getString(1);
						return pwd;
					}
				});
		if (pwdData.equals(pwd)) {
			User u = new User();
			u.setU_name(name);
			return u;
		} else {
			throw new PassWordErrorException();
		}
	}

	@Override
	public int updataPassWord(String name, String oldPwd, String newPwd)
			throws NameErrorException, PassWordErrorException {
		String sql = "update  d_user set u_password = ? where u_name = ?";
		List<String> list = findUserName(name);
		if (list.size() == 0) {
			throw new NameErrorException();
		}
		String pwd = findPwdByName(name);
		if (!oldPwd.equals(pwd)) {
			throw new PassWordErrorException();
		}
		int n = jdbcTemplate.update(sql, new Object[] { newPwd, name },
				new int[] { Types.VARCHAR, Types.VARCHAR });
		return n;
	}

	@Override
	public String findPwdByName(String name) {
		String sql = "select u_password from d_user where u_name=?";
		String pwd = jdbcTemplate.queryForObject(sql, new Object[] { name },
				new int[] { Types.VARCHAR }, new RowMapper<String>() {
					public String mapRow(ResultSet arg0, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						return arg0.getString(1);
					}
				});

		return pwd;
	}

}
