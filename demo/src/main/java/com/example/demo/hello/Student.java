package com.example.demo.hello;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.annotations.Entity;
import org.hibernate.validator.constraints.NotBlank;

//@Entity
public class Student {
	//@Size(min=5, max=10) //has error, not working 
	//@NotBlank(message="Name Field is Required")
	private String studentName;
	private String studentHobby;
	
	private long studentMobile;
	//@Past   //error
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	
	
	public Student() {
		super();
	}
	public Student(String studentName, String studentHobby, long studentMobile, Date studentDOB,
			ArrayList<String> studentSkills) {
		super();
		this.studentName = studentName;
		this.studentHobby = studentHobby;
		this.studentMobile = studentMobile;
		this.studentDOB = studentDOB;
		this.studentSkills = studentSkills;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	

}
