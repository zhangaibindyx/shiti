package com.zab.question.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import oracle.net.aso.q;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;
import com.zab.question.dao.SubjectDao;
import com.zab.question.exception.ChoiceQuestionExistException;
import com.zab.question.exception.SAQuestionExistException;
import com.zab.question.exception.SAQuestionNotExistException;
import com.zab.question.modle.ChoiceQuestion;
import com.zab.question.modle.SAQuestion;

@Repository("subjectDao")
public class SubjectDaoImpl implements SubjectDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int insertSubject(SAQuestion question)
			throws SAQuestionExistException {
		// 插入到 问题表中的问题标题
		String sql = "insert into d_saqes(s_title,s_content,s_answer,s_time,t_id,l_id) values(?,?,?,?,?)";
		int n = jdbcTemplate.update(
				sql,
				new Object[] 
						{ question.getQ_text(), 
						question.getS_content(),
						question.getAns_answer(),
						question.getQ_time(),
						Integer.parseInt(question.getT_id()),
						question.getL_id() }, 
						new int[] { 
						Types.VARCHAR,
						Types.VARCHAR, 
						Types.VARCHAR, 
						Types.VARCHAR,
						Types.INTEGER,
						Types.INTEGER });
		// int n = jdbcTemplate.update(sql, new Object[] { question.getQ_text(),
		// question.getQ_time() }, new int[] { Types.VARCHAR,
		// Types.VARCHAR });
		// /** 问题表插入 */
		// sql = "seclet q_id from d_question where q_title=?";
		// int q_id = jdbcTemplate.queryForObject(sql,
		// new Object[] { question.getQ_text() },
		// new int[] { Types.VARCHAR }, new RowMapper<Integer>() {
		// public Integer mapRow(ResultSet arg0, int arg1)
		// throws SQLException {
		//
		// return arg0.getInt(1);
		// }
		// });
		// /** 答案解析表插入 */
		// sql = "insert into d_answer (ans_answer,q_id) vaules(?,?)";
		// jdbcTemplate.update(sql,
		// new Object[] { question.getAns_answer(), q_id }, new int[] {
		// Types.VARCHAR, Types.INTEGER });
		// /*** 获得ans_id */
		// sql = "select ans_id from d_answer where ans_id=?";
		// int ans_id = jdbcTemplate.queryForObject(sql, new Object[] {},
		// new int[] {}, new RowMapper<Integer>() {
		// public Integer mapRow(ResultSet arg0, int arg1)
		// throws SQLException {
		// return arg0.getInt(1);
		// }
		// });
		//
		// String content = question.getS_content();
		// String t_id = question.getT_id();
		// int c_id = question.getC_id();
		// /** 添加数据 */
		// sql =
		// "insert into d_saq (q_id,s_content,c_id,t_id,a_id) values(?,?,?,?,?)";
		// int i = jdbcTemplate.update(sql, new Object[] { q_id, content, c_id,
		// Integer.parseInt(t_id), ans_id }, new int[] { Types.INTEGER,
		// Types.VARCHAR, Types.INTEGER, Types.INTEGER, Types.INTEGER });
		return n;
	}

	@Override
	public void deleteSubject(SAQuestion question)
			throws SAQuestionNotExistException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSubject(SAQuestion question)
			throws SAQuestionNotExistException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SAQuestion> findSAQuestions(int page, int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SAQuestion> findSAQuestionsByType(int type, int page, int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SAQuestion> findSAQuestionByTitle(String title)
			throws SAQuestionExistException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertChoiceQuestion(ChoiceQuestion question)
			throws ChoiceQuestionExistException {
		// TODO Auto-generated method stub

	}

}
