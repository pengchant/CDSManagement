package com.cds.entity;
// Generated 2016-4-20 18:11:49 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Cdplan generated by hbm2java
 */
public class Cdplan implements java.io.Serializable { 
	private static final long serialVersionUID = 1L;
	private Integer cdplanId;
	private Major major;
	private Term term;
	private String cdplanNum;
	private String cdplanName;
	private Float totalCredits;
	private Float totalClassHour;
	private Integer isCurrent;
	private Set<Cdteachergroup> cdteachergroups = new HashSet<Cdteachergroup>(0);

	public Cdplan() {
	}

	public Cdplan(Major major, Term term, String cdplanNum, String cdplanName, Float totalCredits, Float totalClassHour,
			Integer isCurrent, Set<Cdteachergroup> cdteachergroups) {
		this.major = major;
		this.term = term;
		this.cdplanNum = cdplanNum;
		this.cdplanName = cdplanName;
		this.totalCredits = totalCredits;
		this.totalClassHour = totalClassHour;
		this.isCurrent = isCurrent;
		this.cdteachergroups = cdteachergroups;
	}

	public Integer getCdplanId() {
		return this.cdplanId;
	}

	public void setCdplanId(Integer cdplanId) {
		this.cdplanId = cdplanId;
	}

	public Major getMajor() {
		return this.major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Term getTerm() {
		return this.term;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

	public String getCdplanNum() {
		return this.cdplanNum;
	}

	public void setCdplanNum(String cdplanNum) {
		this.cdplanNum = cdplanNum;
	}

	public String getCdplanName() {
		return this.cdplanName;
	}

	public void setCdplanName(String cdplanName) {
		this.cdplanName = cdplanName;
	}

	public Float getTotalCredits() {
		return this.totalCredits;
	}

	public void setTotalCredits(Float totalCredits) {
		this.totalCredits = totalCredits;
	}

	public Float getTotalClassHour() {
		return this.totalClassHour;
	}

	public void setTotalClassHour(Float totalClassHour) {
		this.totalClassHour = totalClassHour;
	}

	public Integer getIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(Integer isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Set<Cdteachergroup> getCdteachergroups() {
		return this.cdteachergroups;
	}

	public void setCdteachergroups(Set<Cdteachergroup> cdteachergroups) {
		this.cdteachergroups = cdteachergroups;
	}
}
