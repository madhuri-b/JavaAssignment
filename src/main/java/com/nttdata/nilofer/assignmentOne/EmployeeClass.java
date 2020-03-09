package com.nttdata.nilofer.assignmentOne;

public class EmployeeClass {
	// declare variables
	int empId;
	static int empCount;

	//getter for EmpId
	public int getEmpId() {
		return empId;
	}

	//setter for EmpId
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	//print method for EmpId
	public void printEmpId() {
		System.out.println("Employee Id : " + empId);
	}
	
	static void increment() {
		empCount++;
		System.out.printf("Value of empCount is %d after increment",empCount);
	}
}
