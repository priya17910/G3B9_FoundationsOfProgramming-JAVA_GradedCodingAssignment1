package com.departments;

/* TECH DEPARTMENT CLASS EXTENDING SUPER CLASS (SUPER DEPARTMENT) */
public class TechDepartment extends SuperDepartment {
	
	// DEPARTMENT NAME METHOD OVER-RIDDING THE SUPER CLASS METHOD
	@Override
	public String departmentName() {
		return "Tech Department";
	}
	
	// GET TODAYS WORK METHOD OVER-RIDING THE SUPER CLASS METHOD
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	// GET WORK DEADLINE METHOD OVER-RIDING THE SUPER CLASS METHOD
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	// GET TECH STACK INFORMATION METHOD SPECIFIC TO TECH DEPARTMENT CLASS
	public String getTechStackInformation() {
		return "Core Java";
	}
	
}
