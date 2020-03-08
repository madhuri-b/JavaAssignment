package assignmentOnePkg2;

public class Package2Main {

	public static void main(String[] args) {
		CheckProtectedAccess myObj = new CheckProtectedAccess();
		myObj.printCustomerFromSubClass();
		ChkAccessNoSubClass myObj2 = new ChkAccessNoSubClass();
		myObj2.printCustomerfromNonSubClass();
	}

}
