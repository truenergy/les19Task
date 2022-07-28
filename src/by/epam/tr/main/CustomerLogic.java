package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

	public boolean sortCard(Customer client) {
		int number = client.getCreditCard();
		if (number < 345000) {
			return false;
		}

		return true;
	}

	public List<Customer> listSortCard(List<Customer> client) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer b : client) {
			if (sortCard(b)) {
				result.add(b);
			}
		}
		return result;
	}
	
	}


