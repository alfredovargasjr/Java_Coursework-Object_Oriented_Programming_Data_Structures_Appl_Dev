/**
 * @author Alfredo
 * CECS 277
 * Project 6: Super Market Simulation
 * Susan
 */
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.time.*;
import java.util.Scanner;
import java.util.Random;

public class SuperMarketSimulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		menu();
		System.out.println("Program Exit.");
	}
	
	/*
	 * menu, prompts user
	 * input validation
	 */
	public static void menu(){
		Scanner in = new Scanner(System.in);
		int choice = 0;
		boolean flag;
		do{
		try{
			flag = true;
			System.out.println("Menu: \n[1] Start Super Market Simulation\n[0] Exit");
			System.out.println("Choice: ");
			choice = in.nextInt();
			switch (choice){
			case 1: Simulation(); break;
			case 0: flag = false; break;
			default: System.out.println("Invalid Input. Re-enter.");
			}
		}
		catch(InputMismatchException e){
			System.out.println("\nInvalid Input. Re-enter.");
			flag = true;
			in.next();
		}
		}while(flag);
	}
	
	/**
	 * run simulation, set to one hour for demo purposes 
	 */
	public static void Simulation(){
		//time simulation begins
		LocalTime startTime = java.time.LocalTime.now();
		//time for simulation to end, 1 hour after
		LocalTime endTime = startTime.plusHours(1);
		//queue of customers
		Queue<Customer> customerQ = new LinkedList<Customer>();
		//initialize the manipulate times to zero
		LocalTime customerArrive = java.time.LocalTime.of(0, 0), customerQTime, customerServiceTime = java.time.LocalTime.of(0, 0);
		//random object
		Random rand;
		//customer object
		Customer customer;
		//loop until time reaches endtime
		while(java.time.LocalTime.now().compareTo(endTime) < 0){
			//set the first customer to arrive between time
			if(customerArrive.equals(java.time.LocalTime.of(0, 0))){
			rand = new Random();
			customerQTime = java.time.LocalTime.of(0, Math.abs(rand.nextInt() % 3) + 1);
			customerArrive = java.time.LocalTime.now().plusMinutes(customerQTime.getMinute());
			}	
			//if the time of service equals the time, then the customer will be dequeued
			if(!customerServiceTime.equals(java.time.LocalTime.of(0,0)) && customerServiceTime.equals(java.time.LocalTime.now())){
				System.out.println(customerQ.peek().getName() + " was served at " + java.time.LocalTime.now());	
				System.out.println("Service Duration: " + (java.time.LocalTime.now().minusHours(customerQ.peek().getTimeArrived().getHour()).minusMinutes(customerQ.peek().getTimeArrived().getMinute())));
				customerQ.remove();
				customerServiceTime = java.time.LocalTime.of(0, 0);
				if(customerServiceTime.equals(java.time.LocalTime.of(0, 0)) && !customerQ.isEmpty()){
					rand = new Random();
					customerServiceTime = java.time.LocalTime.now().plusMinutes(Math.abs(rand.nextInt() % 4) + 1);
					System.out.println("Servicing " + customerQ.peek().getName() + "....");	
					}
					customerArrive = java.time.LocalTime.of(0, 0);	
			}
			//if customer arriaval time equals current time, then customer arrives and enqueued
			if(customerArrive.equals(java.time.LocalTime.now())){
				customer = new Customer(customerArrive);
				customerQ.add(customer);
				System.out.println(customer.getName() + " has arrived at " + java.time.LocalTime.now());
				if(customerServiceTime.equals(java.time.LocalTime.of(0, 0))){
				rand = new Random();
				customerServiceTime = java.time.LocalTime.now().plusMinutes(Math.abs(rand.nextInt() % 4) + 1);
				System.out.println("Servicing " + customerQ.peek().getName() + "....");	
				}
				customerArrive = java.time.LocalTime.of(0, 0);	
			}	
		}
	}
	/*
	 * while loop until time reached, elapse time + 12 hours, real time 
	 */

}
