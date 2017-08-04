package com.zab.question.modle;
/**
 * 试题类型    简答题  填空题  选择题
 * @author zhangaibin
 *
 */
public class DType {
	private int t_id;
	private String t_title;
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_title() {
		return t_title;
	}
	public void setT_title(String t_title) {
		this.t_title = t_title;
	}
	public DType(int t_id, String t_title) {
		super();
		this.t_id = t_id;
		this.t_title = t_title;
	}
	public DType() {
		super();
	}
	@Override
	public String toString() {
		return "DType [t_id=" + t_id + ", t_title=" + t_title + "]";
	}

}
