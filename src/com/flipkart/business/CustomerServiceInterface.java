
package com.flipkart.business;

import java.util.ArrayList;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.User;


public interface CustomerServiceInterface {
	
	
	public Customer getProfile(User user);
	

	public String bookSlot(int gymID, int slotHour, int customerID);


	public boolean cancelSlot(int gymID, int slotHour, int customerID);
	
	
	public Customer getProfilebyID(int userId);

	public String cancelSlotByID(int slotID, int userID);
}
