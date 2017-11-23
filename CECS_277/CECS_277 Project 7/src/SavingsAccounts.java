
public class SavingsAccounts extends BankAccount {
	private double interestRate;
	 
	 public SavingsAccounts(double initial, double rate) {       
		 super(initial);       
		 interestRate = rate;    
		 }  
	 
	 public void monthEnd() { 
		 /* some stuff with rate */ } 
}
