package by.epam.tr.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import by.epam.tr.main.Customer.SortClient;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> client = new ArrayList<Customer>();
		client.add(new Customer("Petrov", "Ivan", 156885, "BY75ALFA3014000"));
		client.add(new Customer("Vetrov", "Svan", 345885, "BY54BPSB3014001"));
		client.add(new Customer("Serov", "Petr", 567885, "BY32ALFA3014002"));
		client.add(new Customer("Shvedov", "Alex", 765885, "BY86ALFA3014005"));
		client.add(new Customer("Ivanov", "Serg", 569799, "BY69ALFA3014032"));
		
		

		CustomerLogic logic = new CustomerLogic();
		List<Customer> result = logic.listSortCard(client);
		CustomerView view = new CustomerView();
		view.printCreditCard(result);

		Collections.sort(client);
		CustomerView view1 = new CustomerView();
		view1.printSortClient(client);
		
		
		
	}
}
