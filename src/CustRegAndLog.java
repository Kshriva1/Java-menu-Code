import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustRegAndLog {
	public static int custId = 0;
	public static List<Customer> listCust = new ArrayList<>();

	public static void register() {
		Customer c = new Customer();
		Scanner s = new Scanner(System.in);
		System.out.println("you have chosen to login as new customer:");

		c.setCustId("cus" + ++custId);

		System.out.println("Enter the customer name: ");
		String custName = s.next();
		c.setCustName(custName);

		System.out.println("Enter the customer Address");
		String custAddress = s.next();
		c.setCustAddress(custAddress);

		c.setCustPassword(custName.substring(0, 2) + custName.substring(custName.length() - 2));

		listCust.add(c);
	}

	public static boolean login(String custId2, String password) {
		Iterator<Customer> itr = listCust.iterator();
	    while(itr.hasNext()) {
			Customer customer = itr.next();
			if(customer.getCustId().equals(custId2) && customer.getCustPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}
