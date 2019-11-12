import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerLogic {

	public static List<Items> list = new ArrayList<>();
    private static long count = 0;
	public static void viewCatalogue() {
		System.out.println("You have chosen to view all the items");
		Iterator<Items> itr = AdminLogic.catalogue.iterator();
		while(itr.hasNext()) {
			Items item = itr.next();
			System.out.println(item.getItemId());
			System.out.println(item.getItemName());
			System.out.println(item.getItemPrice());
			System.out.println(item.getItemQuantity());
		}
		
	}

	public static void placeOrder() throws ItemsNotAvailableException {
		Scanner s = new Scanner(System.in);
		Items item = new Items();
		
		item.setItemId(++count);
		
		System.out.println("please enter the name of the order: ");
		String name = s.next();
		item.setItemName(name);
		
		System.out.println("Please enter the price of the order: ");
		int price = s.nextInt();
		item.setItemPrice(price);
        
		System.out.println("Please enter the quantity of the order: ");
		int quantity = s.nextInt();
		if(quantity < 5) {
			throw new ItemsNotAvailableException("Quantity ordered is not available");
		} else {
		item.setItemQuantity(quantity);
		}
		list.add(item);
		
		System.out.println("Your order has been placed");
		
	}

	public static void viewYourOrders() {
		Iterator<Items> itr = list.iterator();
		while(itr.hasNext()) {
			Items item = itr.next();
			System.out.println(item.getItemId());
			System.out.println(item.getItemName());
			System.out.println(item.getItemPrice());
			System.out.println(item.getItemQuantity());
		}	
	}
	

}
