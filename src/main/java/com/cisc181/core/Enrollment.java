package com.cisc181.core;
import java.util.UUID;


public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment()
	{
		this.SectionID=SectionID;
		this.StudentID=StudentID;
	}
	
	public double getGrade() {
		return this.Grade;
	}
	public void setGrade(double grade) {
		this.Grade = grade;
	}
	
	
		
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public Enrollment(UUID StudentID,UUID SectionID)
	{
		this.EnrollmentID=UUID.randomUUID();
	}
}

