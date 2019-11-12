import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AdminLogic {
    public static List<Items> catalogue = new ArrayList<>();
    private static int count = 0;
    
    
	public static void viewOrders() {
		System.out.println("You have chosen to view all the orders");
		Iterator<Items> itr = CustomerLogic.list.iterator();
		while(itr.hasNext()) {
			Items item = itr.next();
			System.out.println(item.getItemId());
			System.out.println(item.getItemName());
			System.out.println(item.getItemPrice());
			System.out.println(item.getItemQuantity());
		}
	}

	public static void approveOrders() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id of the order you want to approve: ");
	    long id = s.nextInt();
	    Iterator<Items> itr = CustomerLogic.list.iterator();
	    while(itr.hasNext()) {
			Items item = itr.next();
			if(item.getItemId() == id) {
				item.isApproved();
				break;
			}
		}
		
	}

	public static void rejectOrders() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id of the order you want to cancel: ");
	    long id = s.nextInt();
	    Iterator<Items> itr = CustomerLogic.list.iterator();
	    while(itr.hasNext()) {
			Items item = itr.next();
			if(item.getItemId() == id) {
				itr.remove();
			break;
			}
		}
	}

	public static void updateItem() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id of the order you want to update: ");
	    long id = s.nextInt();
	    Iterator<Items> itr = CustomerLogic.list.iterator();
	    while(itr.hasNext()) {
			Items item = itr.next();
			if(item.getItemId() == id) {
				System.out.println("Enter the new name of the order: ");
				String name = s.next();
				item.setItemName(name);
				
				System.out.println("Enter the new price of the order: ");
				int price = s.nextInt();
				item.setItemPrice(price);
				
				System.out.println("Enter the new quantity of the order: ");
				int quantity = s.nextInt();
				item.setItemQuantity(quantity);
				
				break;
			}
		}
		
	}

	public static void addItems() {
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
		item.setItemQuantity(quantity);
		
		catalogue.add(item);
		
		System.out.println("The item has been added into the catalogue");
		
		
	}

}
