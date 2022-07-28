package by.epam.tr.main;

import java.util.List;

public class CustomerView {
	public void printCreditCard(List<Customer> client) {
		for (Customer b : client) {
			System.out.println(
					"NumberCard:" + b.getCreditCard() + ", surname:" + b.getSurname() + ", name: " + b.getName());

		}
	}
	public void printSortClient(List<Customer> client) {
		for (Customer b : client) {
			System.out.println(
					"Surname: " + b.getSurname() + ", NumberCard:" + b.getCreditCard());

		}
	}
	
}