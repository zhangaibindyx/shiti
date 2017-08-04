package com.zab.question.modle;

/**
 * 描述一道简答题的封装类
 * 
 * @author zhangaibin 不含答案
 */

public class SAQuestion {
	// 简答题的id值
	private int s_id;
	// 问题id 对应问题表中的主键id
	private int q_id;
	// 问题主体 问题的描述
	private String s_content;
	// 问题的标题 对应了问题的标题
	private String q_text;
	// 问题提交时间
	private String q_time;
	// 问题类型id
	private String t_id;
	// 问题类型文本
	private String t_title;

	private String ans_answer;
	private int ans_id;

	private int l_id;
	
	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getAns_answer() {
		return ans_answer;
	}

	public void setAns_answer(String ans_answer) {
		this.ans_answer = ans_answer;
	}

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	private int c_id;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getS_content() {
		return s_content;
	}

	public void setS_content(String s_content) {
		this.s_content = s_content;
	}

	public String getQ_text() {
		return q_text;
	}

	public void setQ_text(String q_text) {
		this.q_text = q_text;
	}

	public String getQ_time() {
		return q_time;
	}

	public void setQ_time(String q_time) {
		this.q_time = q_time;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getT_title() {
		return t_title;
	}

	public void setT_title(String t_title) {
		this.t_title = t_title;
	}

	@Override
	public String toString() {
		return "SAQuestion [s_id=" + s_id + ", q_id=" + q_id + ", s_content="
				+ s_content + ", q_text=" + q_text + ", q_time=" + q_time
				+ ", t_id=" + t_id + ", t_title=" + t_title + "]";
	}

	public SAQuestion(int s_id, int q_id, String s_content, String q_text,
			String q_time, String t_id, String t_title) {
		super();
		this.s_id = s_id;
		this.q_id = q_id;
		this.s_content = s_content;
		this.q_text = q_text;
		this.q_time = q_time;
		this.t_id = t_id;
		this.t_title = t_title;
	}

	public SAQuestion() {
		// TODO Auto-generated constructor stub
	}

}
