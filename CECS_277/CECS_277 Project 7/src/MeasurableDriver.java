/**
 * Alfredo Vargas
 * CECS_277
 * Project 7: Generic interface, generic implementaion
 * Susan
 */

import java.util.ArrayList;
public class MeasurableDriver {

	public static void main(String[] args) {
		 // Calling the static largest method       
		// with an ArrayList of BankAccount objects  
	      ArrayList<BankAccount> accounts = new ArrayList<>();       
	      accounts.add(new BankAccount(0));       
	      accounts.add(new BankAccount(10000));       
	      accounts.add(new BankAccount(2000)); 
	      BankAccount largestAccount = Measurable.largest(accounts);       
	      System.out.println("Largest balance is : " + largestAccount.getBalance());       
	      System.out.println("Expected: 10000");  
	      // Calling the static largest method       
	      // with an ArrayList of Country objects              
	      ArrayList<Country> countries = new ArrayList<>();       
	      countries.add(new Country("Uruguay", 176220));       
	      countries.add(new Country("Thailand", 513120));       
	      countries.add(new Country("Belgium", 30510));  
	      Country largestCountry = Measurable.largest(countries);       
	      System.out.println("Largest area: " + largestCountry.getArea());       
	      System.out.println("Expected: 513120");       
	      System.out.println("Country name: " + largestCountry.getName());       
	      System.out.println("Expected: Thailand");   
	      //create arraylist of students
	      ArrayList<Student> students = new ArrayList<>();
	      students.add(new Student("Alfredo", "Vargas", 3.80));
	      students.add(new Student("Joe", "Vargas", 3.9));
	      students.add(new Student("Bill", "Nye", 2.2));
	      Student largestStudent = Measurable.largest(students);
	      System.out.println(largestStudent);
	      //mixed arraylist
	      ArrayList<BankAccount> mixarray = new ArrayList<>();
	      mixarray.add(new BankAccount(1000));
	      mixarray.add(new SavingsAccounts(5000, 0.3));
	      mixarray.add(new BankAccount(500));
	      mixarray.add(new SavingsAccounts(200, 1.5));
	      BankAccount largestmix = Measurable.largest(mixarray);
	      System.out.println("Largest in mix: " + largestmix.getMeasure());
	}

}
