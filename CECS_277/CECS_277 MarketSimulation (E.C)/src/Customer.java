import java.time.*;
public class Customer {
	/**
	 * private data members 
	 */
	private String name;
	private int id;
	private static int numCustomer;	//the number of the customer, (1st customer, 2nd customer, 3rd customer...)
	private LocalTime timeArrived;	//local time stored in object of arrival
	
	
	/*
	 * default constructor 
	 */
	Customer(){
		numCustomer++;
		name = "Customer" + numCustomer;
		id = numCustomer;
		
		
	}
	/*
	 * overloaded constructor
	 * pass string, set name to string
	 */
	Customer(LocalTime t){
		numCustomer++;
		name = "Customer" + numCustomer;
		timeArrived = t;
		id = numCustomer;
	}
	
	/*
	 * return name of object
	 */
	public String getName(){
		return name;
	}
	
	/*
	 * set name to n
	 */
	public void setName(String n){
		name = n;
	}
	
	/*
	 * get id of the object
	 */
	public int getID(){
		return id;
	}
	
	/*
	 * set the id to i
	 */
	public void setID(int i){
		id = i;
	}
	
	public LocalTime getTimeArrived(){
		return timeArrived;
	}
	
	@Override
	public String toString(){
		return "\nName: " + name;
	}
}
