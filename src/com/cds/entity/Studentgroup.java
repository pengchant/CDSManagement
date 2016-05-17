package com.cds.entity;
// Generated 2016-4-20 18:11:49 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Studentgroup generated by hbm2java
 */
public class Studentgroup implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer stuGroupId;
	private Cddesigntopics cddesigntopics;
	private Student student;
	private Set<Replyplan> replyplans = new HashSet<Replyplan>(0);
	private Set<Student> students = new HashSet<Student>(0);

	public Studentgroup() {
	}

	public Studentgroup(Cddesigntopics cddesigntopics, Student student, Set<Replyplan> replyplans,
			Set<Student> students) {
		this.cddesigntopics = cddesigntopics;
		this.student = student;
		this.replyplans = replyplans;
		this.students = students;
	}

	public Integer getStuGroupId() {
		return this.stuGroupId;
	}

	public void setStuGroupId(Integer stuGroupId) {
		this.stuGroupId = stuGroupId;
	}

	public Cddesigntopics getCddesigntopics() {
		return this.cddesigntopics;
	}

	public void setCddesigntopics(Cddesigntopics cddesigntopics) {
		this.cddesigntopics = cddesigntopics;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Set<Replyplan> getReplyplans() {
		return this.replyplans;
	}

	public void setReplyplans(Set<Replyplan> replyplans) {
		this.replyplans = replyplans;
	}

	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
