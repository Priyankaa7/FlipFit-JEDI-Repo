package com.flipkart.business;

public class CustomerBusiness {
	public void createCustomer() {
		System.out.println("Customer is created..");
	}

	public boolean deleteCustomer(int customerID) {
		System.out.println("Customer is deleted" + customerID);
		return true;
	}

	public boolean updateCustomer(int customerID) {
		System.out.println("Customer is updated" + customerID);
		return true;
	}
public void listCustomer() {
	System.out.println("Listed customers id");
}
}
