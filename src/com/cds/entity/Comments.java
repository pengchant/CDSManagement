package com.cds.entity;
// Generated 2016-4-20 18:11:49 by Hibernate Tools 4.3.1.Final

/**
 * Comments generated by hbm2java
 */
public class Comments implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer commentId;
	private Teacher teacher;
	private String comments;

	public Comments() {
	}

	public Comments(Teacher teacher, String comments) {
		this.teacher = teacher;
		this.comments = comments;
	}

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
