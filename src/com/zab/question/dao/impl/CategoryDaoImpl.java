package com.zab.question.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zab.question.dao.CategoryDao;
import com.zab.question.exception.CategoryExistException;
import com.zab.question.exception.CategoryNotExistException;
import com.zab.question.modle.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insertCategorty(Category category)
			throws CategoryExistException {

	}

	@Override
	public List<Category> findAll() {
		String sql = "select * from d_category";
		List<Category> list = jdbcTemplate.query(sql,
				new RowMapper<Category>() {
					@Override
					public Category mapRow(ResultSet res, int rownum)
							throws SQLException {
						Category c = new Category();
						c.setC_id(res.getInt(1));
						c.setC_title(res.getString(2));
						return c;
					}
				});
		return list;
	}

	@Override
	public void deleteCategorty(Category category)
			throws CategoryNotExistException {
		// TODO Auto-generated method stub

	}

}
