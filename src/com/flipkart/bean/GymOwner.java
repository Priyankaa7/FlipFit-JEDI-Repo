/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class GymOwner {

	/**
	 * @param args
	 */
	public GymOwner(String userId, String userName, String email, String password,String name, int isApproved,  String contactNumber) {
		super(userId, userName, email, password, Role.CUSTOMER);
		this.name = name;
		this.isApproved= isApproved;
		this.contactNumber = contactNumber;
	}
	private String name;
	private String contactNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	private List<String> gymCentreIDs;
    private int isApproved;
    
	public List<String> getGymCentreIDs() {
		return gymCentreIDs;
	}
	public void setGymCentreIDs(List<String> gymCentreIDs) {
		this.gymCentreIDs = gymCentreIDs;
	}
	public int getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}
	@Override
    public String toString() {
        return
        		super.toString()+ "Name" + name+ ",  Contact Number: " + contactNumber;
    }

}
