package com.cds.entity;
// Generated 2016-4-20 18:11:49 by Hibernate Tools 4.3.1.Final

/**
 * Evalstandards generated by hbm2java
 */
public class Evalstandards implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer evalStandId;
	private Cdteachergroup cdteachergroup;
	private Float attendCoe;
	private Float procAccCoe;
	private Float replyCoe;
	private Float selfCoe;

	public Evalstandards() {
	}

	public Evalstandards(Cdteachergroup cdteachergroup, Float attendCoe, Float procAccCoe, Float replyCoe,
			Float selfCoe) {
		this.cdteachergroup = cdteachergroup;
		this.attendCoe = attendCoe;
		this.procAccCoe = procAccCoe;
		this.replyCoe = replyCoe;
		this.selfCoe = selfCoe;
	}

	public Integer getEvalStandId() {
		return this.evalStandId;
	}

	public void setEvalStandId(Integer evalStandId) {
		this.evalStandId = evalStandId;
	}

	public Cdteachergroup getCdteachergroup() {
		return this.cdteachergroup;
	}

	public void setCdteachergroup(Cdteachergroup cdteachergroup) {
		this.cdteachergroup = cdteachergroup;
	}

	public Float getAttendCoe() {
		return this.attendCoe;
	}

	public void setAttendCoe(Float attendCoe) {
		this.attendCoe = attendCoe;
	}

	public Float getProcAccCoe() {
		return this.procAccCoe;
	}

	public void setProcAccCoe(Float procAccCoe) {
		this.procAccCoe = procAccCoe;
	}

	public Float getReplyCoe() {
		return this.replyCoe;
	}

	public void setReplyCoe(Float replyCoe) {
		this.replyCoe = replyCoe;
	}

	public Float getSelfCoe() {
		return this.selfCoe;
	}

	public void setSelfCoe(Float selfCoe) {
		this.selfCoe = selfCoe;
	}

}