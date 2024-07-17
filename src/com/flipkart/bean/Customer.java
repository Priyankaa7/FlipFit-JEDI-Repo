/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class Customer extends User{

	/**
	 * @param args
	 */
	private String name;
	private int age;
	private String location;
	private String contactNumber;
	
	
	/**
	 * @param name
	 * @param age
	 * @param location
	 * @param contactNumber
	 */
	public Customer(String userId, String userName, String email, String password,String name, int age, String location, String contactNumber) {
		super(userId, userName, email, password, Role.CUSTOMER);
		this.name = name;
		this.age = age;
		this.location = location;
		this.contactNumber = contactNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
    public String toString() {
        return
        		super.toString()+ "Name" + name+ ", Age: " +age +", Location: "+ location+ ", Contact Number: " + contactNumber;
    }
	

}
