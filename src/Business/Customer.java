package Business;

import java.util.UUID;

public class Customer {
	
	private String firstName;
	private String lastName;
	private UUID uniqueID;
	private String address;
	
	public Customer(String firstName, String lastName, UUID uniqueID, String adress){//Constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.uniqueID = uniqueID;
		this.address = adress;
	}
	
	public String getFirstName() {//returns the customer's first name
		return firstName;
	}
	
	public String getLastName() {//returns the customer's last name
		return lastName;
	}
	
	public UUID getUniqueID() {//returns the customer's ID
		return uniqueID;
	}
	
	public String getAdress() {//returns the customer's address
		return address;
	}
	
	public String toString() {//returns the customer's information
		return "ID: "+uniqueID+"\n First name: "+firstName +"\n Last name: "+ lastName +"\n Address "+ address;
	}
	

}
