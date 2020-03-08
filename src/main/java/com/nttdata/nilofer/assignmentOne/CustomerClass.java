package com.nttdata.nilofer.assignmentOne;
//creating new class

public class CustomerClass {

	
	//declaring static variable which contains total count of customers 
	//And final variable MAXPHONES to store max number of allowed phones
	static int custCount = 0;
	final int MAXPHONES=3;
	
	
	// private variables for the class
	private int custID;
	private String custName;
	
	//declaring 4 variables with 4 different access modifiers	
	public String publicVariable = "Public Variable";
	private String privateVariable = "Private Variable";
	protected String protectedVariable = "Protected Variable";
	String defaultVariable = "Default variable";

	// print method for the class
	protected void printMethod() {
		System.out.println("Customer ID   :" + custID);
		System.out.println("Customer Name :" + custName);

	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public class CustomerAddress {

		private String addressLine1 = "Address line 1";
		private String addressLine2 = "Address line 2";
		private String zipCode = "zip code";
		String accessPrivateVariable = privateVariable;
		public void printAddress() {
			System.out.println("Address : \n" + addressLine1 + "\n" + addressLine2 + "\n" + zipCode);
		}
	}

	protected class CustomerContact {

		private int contactNumber1 = 11111111;
		private int contactNumber2 = 88888888;

		void printContact() {
			System.out.println("Contact : \n" + contactNumber1 + "\n" + contactNumber2);
		}

	}

}
