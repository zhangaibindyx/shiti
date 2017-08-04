package com.zab.question.modle;

public class ChoiceQuestion {
	private int cq_id;// INT PRIMARY KEY AUTO_INCREMENT,
	private int q_id; // INT NOT NULL UNIQUE,
	private String cq_contnet;// VARCHAR(300) NOT NULL,
	private String cq_choice_a;// VARCHAR(300) NOT NULL,
	private String cq_choice_b;// VARCHAR(300) NOT NULL,
	private String cq_choice_c;// VARCHAR(300) NOT NULL,
	private String cq_choice_d;// VARCHAR(300) NOT NULL,
	private int c_id;// INT NOT NULL,
	private int t_id;// INT NOT NULL,
	private int a_id;// INT NOT NULL

	private String q_title;// VARCHAR(300) NOT NULL,
	private String q_time;// VARCHAR(50) NOT NULL

	public ChoiceQuestion(int cq_id, int q_id, String cq_contnet,
			String cq_choice_a, String cq_choice_b, String cq_choice_c,
			String cq_choice_d, int c_id, int t_id, int a_id, String q_title,
			String q_time) {
		super();
		this.cq_id = cq_id;
		this.q_id = q_id;
		this.cq_contnet = cq_contnet;
		this.cq_choice_a = cq_choice_a;
		this.cq_choice_b = cq_choice_b;
		this.cq_choice_c = cq_choice_c;
		this.cq_choice_d = cq_choice_d;
		this.c_id = c_id;
		this.t_id = t_id;
		this.a_id = a_id;
		this.q_title = q_title;
		this.q_time = q_time;
	}

	@Override
	public String toString() {
		return "ChoiceQuestion [cq_id=" + cq_id + ", q_id=" + q_id
				+ ", cq_contnet=" + cq_contnet + ", cq_choice_a=" + cq_choice_a
				+ ", cq_choice_b=" + cq_choice_b + ", cq_choice_c="
				+ cq_choice_c + ", cq_choice_d=" + cq_choice_d + ", c_id="
				+ c_id + ", t_id=" + t_id + ", a_id=" + a_id + ", q_title="
				+ q_title + ", q_time=" + q_time + "]";
	}

	public int getCq_id() {
		return cq_id;
	}

	public void setCq_id(int cq_id) {
		this.cq_id = cq_id;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getCq_contnet() {
		return cq_contnet;
	}

	public void setCq_contnet(String cq_contnet) {
		this.cq_contnet = cq_contnet;
	}

	public String getCq_choice_a() {
		return cq_choice_a;
	}

	public void setCq_choice_a(String cq_choice_a) {
		this.cq_choice_a = cq_choice_a;
	}

	public String getCq_choice_b() {
		return cq_choice_b;
	}

	public void setCq_choice_b(String cq_choice_b) {
		this.cq_choice_b = cq_choice_b;
	}

	public String getCq_choice_c() {
		return cq_choice_c;
	}

	public void setCq_choice_c(String cq_choice_c) {
		this.cq_choice_c = cq_choice_c;
	}

	public String getCq_choice_d() {
		return cq_choice_d;
	}

	public void setCq_choice_d(String cq_choice_d) {
		this.cq_choice_d = cq_choice_d;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getQ_title() {
		return q_title;
	}

	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}

	public String getQ_time() {
		return q_time;
	}

	public void setQ_time(String q_time) {
		this.q_time = q_time;
	}

	public ChoiceQuestion() {
		// TODO Auto-generated constructor stub
	}

}
