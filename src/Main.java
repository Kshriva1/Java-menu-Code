import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner s;
		int i = 1;
		while (flag) {
			s = new Scanner(System.in);
			if (i == 1) {
				System.out.println("Please enter the usertype: ");
				System.out.print("1.Admin" + " ");
				System.out.println("2.Customer");

				int input = s.nextInt();
				if (input == 1) {
					System.out.println("you have chosen to login as Admin:");
					System.out.println("please enter username: ");
					String username = s.next();
					System.out.println("please enter password: ");
					String password = s.next();
					boolean validation = AdminValidate.validate(username, password);
					if (validation) {
						System.out.println("you have successfully logged in");
						System.out.println("please enter the option to perform");
						System.out.print("1. View Orders" + " ");
						System.out.print("2. Approve Orders" + " ");
						System.out.print("3. Reject orders" + " ");
						System.out.print("4.update item" + " ");
						System.out.println("5.Enter items in catalogue");
						System.out.println("6. Exit");

						int inputLogin = s.nextInt();
						switch (inputLogin) {
						case 1:
							AdminLogic.viewOrders();
							break;
						case 2:
							AdminLogic.approveOrders();
							break;
						case 3:
							AdminLogic.rejectOrders();
							break;
						case 4:
							AdminLogic.updateItem();
							break;
						case 5:
							AdminLogic.addItems();
							break;
						case 6:
							flag = false;
							System.out.println("You have exited the system");
							break;
						}
					} else {
						System.out.println("Please enter correct information");
					}
				} else {
					System.out.println("You have chosen to login as a customer");
					CustRegAndLog.register();

					System.out.println("please enter custID");
					String custId = s.next();

					System.out.println("please enter password");
					String password = s.next();

					boolean login = CustRegAndLog.login(custId, password);
					if (login) {
						System.out.println("Please choose the option to perform");
						System.out.println("1. view catalogue");
						System.out.println("2. place order");
						System.out.println("3. view your orders");
						System.out.println("4. exit");
						int custOption = s.nextInt();

						switch (custOption) {
						case 1:
							CustomerLogic.viewCatalogue();
							break;
						case 2:
							try {
								CustomerLogic.placeOrder();
							} catch (ItemsNotAvailableException e) {
								System.out.println(e.message);
							}
							break;
						case 3:
							CustomerLogic.viewYourOrders();
							break;
						case 4:
							flag = false;
							System.out.println("You have exited the application");
						}

					} else {
						System.out.println("Enter correct information");
					}
				}

			} else {
				System.out.println("Please enter the usertype: ");
				System.out.println("1.Admin");
				System.out.println("2.New Customer");
				System.out.println("3.existing customer");
				int custInput = s.nextInt();
				if (custInput == 2) {
					CustRegAndLog.register();

					System.out.println("please enter custID");
					String custId = s.next();

					System.out.println("please enter password");
					String password = s.next();

					boolean login = CustRegAndLog.login(custId, password);
					if (login) {
						System.out.println("Please choose the option to perform");
						System.out.println("1. view catalogue");
						System.out.println("2. place order");
						System.out.println("3. view your orders");
						System.out.println("4. exit");
						int custOption = s.nextInt();

						switch (custOption) {
						case 1:
							CustomerLogic.viewCatalogue();
							break;
						case 2:
							try {
								CustomerLogic.placeOrder();
							} catch (ItemsNotAvailableException e) {
								System.out.println(e.message);
							}
							break;
						case 3:
							CustomerLogic.viewYourOrders();
							break;
						case 4:
							flag = false;
							System.out.println("You have exited the application");
						}

					} else {
						System.out.println("Enter correct information");
					}
				} else if (custInput == 3) {
					System.out.println("you have chosen to login as an existing cutomer");
					System.out.println("please enter custID");
					String custId = s.next();

					System.out.println("please enter password");
					String password = s.next();

					boolean login = CustRegAndLog.login(custId, password);
					if (login) {
						System.out.println("Please choose the option to perform");
						System.out.println("1. view catalogue");
						System.out.println("2. place order");
						System.out.println("3. view your orders");
						System.out.println("4. exit");
						int custOption = s.nextInt();

						switch (custOption) {
						case 1:
							CustomerLogic.viewCatalogue();
							break;
						case 2:
							try {
								CustomerLogic.placeOrder();
							} catch (ItemsNotAvailableException e) {
								System.out.println(e.message);
							}
							break;
						case 3:
							CustomerLogic.viewYourOrders();
							break;
						case 4:
							flag = false;
							System.out.println("You have exited the application");
						}

					} else {
						System.out.println("Enter correct information");
					}
				} else if (custInput == 1) {
					System.out.println("you have chosen to login as Admin:");
					System.out.println("please enter username: ");
					String username = s.next();
					System.out.println("please enter password: ");
					String password = s.next();
					boolean validation = AdminValidate.validate(username, password);
					if (validation) {
						System.out.println("you have successfully logged in");
						System.out.println("please enter the option to perform");
						System.out.print("1. View Orders" + " ");
						System.out.print("2. Approve Orders" + " ");
						System.out.print("3. Reject orders" + " ");
						System.out.print("4.update item" + " ");
						System.out.println("5.Enter items in catalogue");
						System.out.println("6. Exit");

						int inputLogin = s.nextInt();
						switch (inputLogin) {
						case 1:
							AdminLogic.viewOrders();
							break;
						case 2:
							AdminLogic.approveOrders();
							break;
						case 3:
							AdminLogic.rejectOrders();
							break;
						case 4:
							AdminLogic.updateItem();
							break;
						case 5:
							AdminLogic.addItems();
							break;
						case 6:
							flag = false;
							System.out.println("You have exited the system");
							break;
						}
					} else {
						System.out.println("Please enter correct information");
					}
				}
			}
			i += 1;
		}
	}

}
