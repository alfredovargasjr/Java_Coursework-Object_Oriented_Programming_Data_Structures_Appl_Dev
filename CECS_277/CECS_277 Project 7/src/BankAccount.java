
public class BankAccount implements Measurable {

	 private double balance;    
	 public BankAccount(double initial) { 
		 balance = initial; 
		 }    
	 public void deposit(double amt) { 
		 balance += amt; 
		 }    
	 public void withdraw(double amt) { 
		 balance -= amt; 
		 }    
	 public double getBalance() { 
		 return balance; 
		 }    
	/*
	 * return comparable, for implemented method getMeasure()
	 * @see Measurable#getMeasure()
	 */
	@Override
	public Comparable getMeasure() {
		return balance;
	} 
	
	

}
