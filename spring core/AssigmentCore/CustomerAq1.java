package org.Bhargav.AssigmentCore;

public class CustomerAq1 {
 private int customerId;
 private String customerName;
 private int customerContact;
 private String customerAddress;
 
 private SpringAQ1 springAQ1;  // WE ARE CALLING  SPRINGAQ1 in this class by creating this 
 
public SpringAQ1 getSpringAQ1() {
	return springAQ1;
}
public void setSpringAQ1(SpringAQ1 springAQ1) {
	this.springAQ1 = springAQ1;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(int customerContact) {
	this.customerContact = customerContact;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
 public void details() {
	 System.out.println("Customer id:"+getCustomerId()+"Customer Name:"+getCustomerName()+"Customer contact:"+getCustomerContact()
	     +"Customer Address:"+getCustomerAddress()+" "+springAQ1.getCountry()+springAQ1.getState()+springAQ1.getCity()
	     +springAQ1.getStreet()+springAQ1.getZip());
 }
	 
 }
 

