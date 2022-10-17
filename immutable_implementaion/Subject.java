package com.practice.Immutable;

public class Subject implements Cloneable{
	private String subjectName;
	private String subjectId;
	private String subjectCode;
	private String grade;

	public Subject(String subjectName, String subjectId, String subjectCode , String grade) {
		super();
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.subjectCode = subjectCode;
		this.grade=grade;
	}

	public Subject() {
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", subjectId=" + subjectId + ", subjectCode=" + subjectCode
				+ ", grade=" + grade + "]";
	}

}
