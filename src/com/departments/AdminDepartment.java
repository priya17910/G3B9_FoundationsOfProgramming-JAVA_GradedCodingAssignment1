package com.departments;

/* ADMIN DEPARTMENT CLASS EXTENDING SUPER CLASS (SUPER DEPARTMENT) */
public class AdminDepartment extends SuperDepartment {
	
	// DEPARTMENT NAME METHOD OVER-RIDDING THE SUPER CLASS METHOD
	@Override
	public String departmentName() {
		return "Admin Department";
	}
	
	// GET TODAYS WORK METHOD OVER-RIDING THE SUPER CLASS METHOD
	@Override
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	// GET WORK DEADLINE METHOD OVER-RIDING THE SUPER CLASS METHOD
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
