package com.zab.question.modle;

public class Category {
	private int c_id;
	private String c_title;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_title() {
		return c_title;
	}

	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	@Override
	public String toString() {
		return "CategoryDao [c_id=" + c_id + ", c_title=" + c_title + "]";
	}

	public Category(int c_id, String c_title) {
		super();
		this.c_id = c_id;
		this.c_title = c_title;
	}

	public Category() {
		super();
	}

}
