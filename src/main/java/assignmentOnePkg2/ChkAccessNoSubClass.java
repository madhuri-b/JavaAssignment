package assignmentOnePkg2;
import com.nttdata.nilofer.assignmentOne.CustomerClass;

public class ChkAccessNoSubClass {

public void printCustomerfromNonSubClass() {
		
		CustomerClass customer = new CustomerClass();
		System.out.println( "Availabe from different Package and no sub class is " + customer.publicVariable);				
	}
}
