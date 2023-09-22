package com.departments;

/* SUPER CLASS THAT IS TO BE EXTENDED BY OTHER SUB CLASSES */
public class SuperDepartment {

	// DEPARTMENT NAME METHOD TO BE OVER-RIDDEN IN SUB CLASSES
	public String departmentName() {
		return "Super Department";
	}

	// GET TODAYS WORK METHOD TO BE OVER-RIDDEN IN SUB CLASSES
	public String getTodaysWork() {
		return "No Work as of now";
	}

	// GET WORK DEADLINE METHOD TO BE OVER-RIDDEN IN SUB CLASSES
	public String getWorkDeadline() {
		return "Nil";
	}
	
	// IS TODAY A HOLIDAY METHOD TO BE CALLED DIRECTLY FROM SUPER CLASS BY ACCESSING IT THROUGH OBJECT OF SUB CLASSES
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
}
