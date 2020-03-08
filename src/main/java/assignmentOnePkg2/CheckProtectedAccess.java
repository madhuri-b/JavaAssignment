package assignmentOnePkg2;

import com.nttdata.nilofer.assignmentOne.CustomerClass;

public class CheckProtectedAccess extends CustomerClass {
	
	public void printCustomerFromSubClass() {
		
		CustomerClass customer = new CustomerClass();
		 this.printMethod();
		System.out.println( "Availabe from different Package and a sub class obj is " +  this.protectedVariable);
		System.out.println( "Availabe from different Package and a sub class obj is " + this.publicVariable);
		System.out.println( "Availabe from different Package and a class obj is " +  customer.publicVariable);
					
	}

}
