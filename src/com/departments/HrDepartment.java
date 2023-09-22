package com.departments;

/* HR DEPARTMENT CLASS EXTENDING SUPER CLASS (SUPER DEPARTMENT) */
public class HrDepartment extends SuperDepartment {
	
	// DEPARTMENT NAME METHOD OVER-RIDDING THE SUPER CLASS METHOD
	@Override
	public String departmentName() {
		return "HR Department";
	}
	
	// GET TODAYS WORK METHOD OVER-RIDING THE SUPER CLASS METHOD
	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	
	// GET WORK DEADLINE METHOD OVER-RIDING THE SUPER CLASS METHOD
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	// DO ACTIVITY METHOD SPECIFIC TO HR DEPARTMENT CLASS
	public String doActivity() {
		return "team Lunch";
	}
	
}
