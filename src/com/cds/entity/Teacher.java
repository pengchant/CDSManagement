package com.cds.entity;
// Generated 2016-4-20 18:11:49 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher generated by hbm2java
 */
public class Teacher implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer teacherId;
	private Account account;
	private College college;
	private String teacherWorkId;
	private String teacherName;
	private Set<Cdteachergroup> cdteachergroups = new HashSet<Cdteachergroup>(0);
	private Set<Replygroup> replygroups = new HashSet<Replygroup>(0);
	private Set<Cddesigntopics> cddesigntopicses = new HashSet<Cddesigntopics>(0);
	private Set<Cdteachergroup> cdteachergroups_1 = new HashSet<Cdteachergroup>(0);
	private Set<Comments> commentses = new HashSet<Comments>(0);
	private Set<Processassshedule> processassshedules = new HashSet<Processassshedule>(0);
	private Set<Replyrecords> replyrecordses = new HashSet<Replyrecords>(0);

	public Teacher() {
	}

	public Teacher(Account account, College college, String teacherWorkId, String teacherName,
			Set<Cdteachergroup> cdteachergroups, Set<Replygroup> replygroups, Set<Cddesigntopics> cddesigntopicses,
			Set<Cdteachergroup> cdteachergroups_1, Set<Comments> commentses, Set<Processassshedule> processassshedules,
			Set<Replyrecords> replyrecordses) {
		this.account = account;
		this.college = college;
		this.teacherWorkId = teacherWorkId;
		this.teacherName = teacherName;
		this.cdteachergroups = cdteachergroups;
		this.replygroups = replygroups;
		this.cddesigntopicses = cddesigntopicses;
		this.cdteachergroups_1 = cdteachergroups_1;
		this.commentses = commentses;
		this.processassshedules = processassshedules;
		this.replyrecordses = replyrecordses;
	}

	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getTeacherWorkId() {
		return this.teacherWorkId;
	}

	public void setTeacherWorkId(String teacherWorkId) {
		this.teacherWorkId = teacherWorkId;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Set<Cdteachergroup> getCdteachergroups() {
		return this.cdteachergroups;
	}

	public void setCdteachergroups(Set<Cdteachergroup> cdteachergroups) {
		this.cdteachergroups = cdteachergroups;
	}

	public Set<Replygroup> getReplygroups() {
		return this.replygroups;
	}

	public void setReplygroups(Set<Replygroup> replygroups) {
		this.replygroups = replygroups;
	}

	public Set<Cddesigntopics> getCddesigntopicses() {
		return this.cddesigntopicses;
	}

	public void setCddesigntopicses(Set<Cddesigntopics> cddesigntopicses) {
		this.cddesigntopicses = cddesigntopicses;
	}

	public Set<Cdteachergroup> getCdteachergroups_1() {
		return this.cdteachergroups_1;
	}

	public void setCdteachergroups_1(Set<Cdteachergroup> cdteachergroups_1) {
		this.cdteachergroups_1 = cdteachergroups_1;
	}

	public Set<Comments> getCommentses() {
		return this.commentses;
	}

	public void setCommentses(Set<Comments> commentses) {
		this.commentses = commentses;
	}

	public Set<Processassshedule> getProcessassshedules() {
		return this.processassshedules;
	}

	public void setProcessassshedules(Set<Processassshedule> processassshedules) {
		this.processassshedules = processassshedules;
	}

	public Set<Replyrecords> getReplyrecordses() {
		return this.replyrecordses;
	}

	public void setReplyrecordses(Set<Replyrecords> replyrecordses) {
		this.replyrecordses = replyrecordses;
	}

}
