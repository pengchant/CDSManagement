package com.cds.entity;
// Generated 2016-4-20 18:11:49 by Hibernate Tools 4.3.1.Final

/**
 * Selfevaluation generated by hbm2java
 */
public class Selfevaluation implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer selfEvaId;
	private Cddesigntopics cddesigntopics;
	private Student student;
	private Float selfScore;
	private String selfDescribtion;

	public Selfevaluation() {
	}

	public Selfevaluation(Cddesigntopics cddesigntopics, Student student, Float selfScore, String selfDescribtion) {
		this.cddesigntopics = cddesigntopics;
		this.student = student;
		this.selfScore = selfScore;
		this.selfDescribtion = selfDescribtion;
	}

	public Integer getSelfEvaId() {
		return this.selfEvaId;
	}

	public void setSelfEvaId(Integer selfEvaId) {
		this.selfEvaId = selfEvaId;
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

	public Float getSelfScore() {
		return this.selfScore;
	}

	public void setSelfScore(Float selfScore) {
		this.selfScore = selfScore;
	}

	public String getSelfDescribtion() {
		return this.selfDescribtion;
	}

	public void setSelfDescribtion(String selfDescribtion) {
		this.selfDescribtion = selfDescribtion;
	}

}
