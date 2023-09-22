package com.driver;

import com.departments.AdminDepartment;
import com.departments.HrDepartment;
import com.departments.TechDepartment;

/* DRIVER CLASS FOR CREATING OBJECTS AND USING THE FUNCTIONALITIES OF BASE CLASS AND ALL SUB CLASSES */
public class Main {

	public static void main(String[] args) {
		
		// CREATING ADMIN DEPARTMENT OBJECT
		AdminDepartment adminDept = new AdminDepartment();
		
		/* CALLING ADMIN DEPARTMENT METHODS STARTS HERE */
		System.out.println("Welcome to " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		/* CALLING ADMIN DEPARTMENT METHODS ENDS HERE */
		
		System.out.println();
		
		// CREATING HR DEPARTMENT OBJECT
		HrDepartment hrDept = new HrDepartment();
		
		/* CALLING HR DEPARTMENT METHODS STARTS HERE */
		System.out.println("Welcome to " + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		/* CALLING HR DEPARTMENT METHODS ENDS HERE */
		
		System.out.println();
		
		// CREATING TECH DEPARTMENT OBJECT
		TechDepartment techDept = new TechDepartment();
		
		/* CALLING TECH DEPARTMENT METHODS STARTS HERE */
		System.out.println("Welcome to " + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		/* CALLING TECH DEPARTMENT METHODS ENDS HERE */

	}
}
