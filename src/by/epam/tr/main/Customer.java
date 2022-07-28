package by.epam.tr.main;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int creditCard;
	private String accountNumber;

	public Customer() {
		id = 0;
		surname = "";
		name = "";
		patronymic = "";
		address = "";
		creditCard = 0;
		accountNumber = "";
	}

	public Customer(int id, String surname, String name, String patronymic, String address, int creditCard,
			String accountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCard = creditCard;
		this.accountNumber = accountNumber;

	}

	public Customer(String surname, String name, int creditCard, String accountNumber) {

		this.surname = surname;
		this.name = name;
		this.creditCard = creditCard;
		this.accountNumber = accountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public int compareTo(Customer customer) {
		// TODO Auto-generated method stub
		return surname.compareTo(customer.getSurname());
	}
	
	

}