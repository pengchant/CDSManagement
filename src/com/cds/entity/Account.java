package com.cds.entity;
// Generated 2016-4-20 18:11:49 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account implements java.io.Serializable { 
	private static final long serialVersionUID = 1L;
	private Integer accId;
	private String accountId;
	private String passwords;
	private Integer role;
	private Set<Teacher> teachers = new HashSet<Teacher>(0);
	private Set<Student> students = new HashSet<Student>(0);

	public Account() {
	}

	public Account(String accountId, String passwords, Integer role, Set<Teacher> teachers, Set<Student> students) {
		this.accountId = accountId;
		this.passwords = passwords;
		this.role = role;
		this.teachers = teachers;
		this.students = students;
	}

	public Integer getAccId() {
		return this.accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPasswords() {
		return this.passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Set<Teacher> getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
