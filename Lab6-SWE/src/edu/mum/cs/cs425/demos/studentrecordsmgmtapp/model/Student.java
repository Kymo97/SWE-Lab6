package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {

	private int studentId;
	private String name;
	private LocalDate dateOfAdmission;

	public Student() {

	}

	public Student(int studentId, String name, LocalDate dateOfAdmission) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = dateOfAdmission;
	}

	public Student(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + ", ID: " + this.getStudentId() + ", Date Of Admission: "
				+ this.getDateOfAdmission().toString();
	}

}
