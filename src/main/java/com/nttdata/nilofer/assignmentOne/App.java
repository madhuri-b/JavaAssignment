package com.nttdata.nilofer.assignmentOne;

public class App {
	public static void main(String[] args) {

		// creating an instance of CustomerClass
		CustomerClass customer = new CustomerClass();
		CustomerClass customer2 = new CustomerClass();

		// calling print method before calling setter to assign value to fields
		System.out.println("Printing Values before setting them to show default values");
		customer.printMethod();

		// calling setter method to set values to fields
		customer.setCustID(101);
		customer.setCustName("Arindam Banerjee");

		// calling print method before calling setter to assign value to fields
		System.out.println("Printing Values after calling setter ");
		customer.printMethod();

		// printing values using getter
		System.out.println("Printing Values using getter ");
		System.out.println(customer.getCustID());
		System.out.println(customer.getCustName());

		CustomerClass.CustomerAddress customerAddress = customer.new CustomerAddress();
		customerAddress.printAddress();
		CustomerClass.CustomerContact customerContact = customer.new CustomerContact();
		customerContact.printContact();

		// print all 4 variables
		System.out.println("Variable 1 is " + customer.defaultVariable);
		System.out.println("Variable 2 is " + customer.protectedVariable);
		System.out.println("Variable 3 is " + customer.publicVariable);

		// increment the custCount
		customer.custCount++;

		System.out.println("value of Customer Count as accessed from Classname after first increment is : "
				+ CustomerClass.custCount++);
		System.out.println(
				"value of Customer Count as acessed from first obj after second increment is : " + customer.custCount);
		System.out.println("value of Customer Count as acessed from second obj after second increment is : "
				+ customer2.custCount);

		// print MAXPHONES
		System.out.println("MAXPHONES accessed via object is " + customer.MAXPHONES);
		EmployeeClass employee = new EmployeeClass();
		employee.setEmpId(1001);
		employee.printEmpId();

	}

}
