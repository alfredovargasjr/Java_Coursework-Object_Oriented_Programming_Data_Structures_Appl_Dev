import java.util.*;
public class project1 {

	public static void main(String[] args) 
	{
		userEntry();	//calls to method
	}
	
	public static void userEntry()	//prompts user for entry of num with inputvalidation
	{
		System.out.println("Enter a Number: ");
		int num = inputvalidation();
		menu(num);
	}
	
	public static void menu(int num)	//prompt menu, validate entry, 
	{
		Scanner scan = new Scanner(System.in);
		String menuChoice;
		boolean flag = false; //boolean for menu verification
		System.out.println("[a] Check if number is odd or even \n"
						 + "[b] Check if number is prime \n"
		 		         + "[c] Check if number is a power of 2\n"
		 		         + "[e] End Program \n");
		do{
			menuChoice = scan.nextLine();
			if(menuChoice.equals("a") || menuChoice.equals("A"))
			{
				checkOddEven(num);
				continueScreen(num);
				break;
			}
			if(menuChoice.equals("b") || menuChoice.equals("B"))
			{
				checkPrime(num);
				continueScreen(num);
				break;
			}
			if(menuChoice.equals("c") || menuChoice.equals("C"))
			{
				checkPower(num);
				continueScreen(num);
				break;
			}
			if(menuChoice.equals("e") || menuChoice.equals("E"))
			{
				endScreen();
				break;
			}
			else
			{
				System.out.println("Invalid entry. Reenter Menu option.");
				flag = true;
			}
		}while(flag);
		
	}
	
	static void checkPrime(int num)		//check if num is prime
	{
		boolean prime = false;
		for(int i = 2; i <= Math.sqrt(num); i++)	//if any i from 2 to sqrt divisible by num then prime
			{
				if( num % i == 0)
				{
					prime = false; 
				}
				else
				{
					prime = true;
				}
			}
		if(prime == true)
		{
			System.out.println(num + " is a prime number.");
		}
		if(prime == false)
		{
			System.out.println(num + " is not a prime number.");
		}
	}

	private static void checkPower(int num) //if log.num and log.2 are divisible then num is power of 2
	{
		double test = Math.log10(num) / Math.log10(2);
		if(test % 1 == 0)
		{
			System.out.println(num + " is a power of 2.");
		}
		else
			System.out.println(num + " is not a power of 2.");
	}

	public static void checkOddEven(int num) //if num divisble by 2 then even,if else odd 
	{
		if ((num % 2) == 0)
		{
			System.out.println(num + " is even.");
		}
		else
		{
			System.out.println(num + " is odd.");
		}
	}
	
	public static void continueScreen(int num)	//prompt user for rerunning of the program
	{
		Scanner scan = new Scanner(System.in);		
		System.out.println("Do you want to check another number? [Y = Yes / N = No]");
		boolean flag = false;	//test for cont entry 
		do{
			flag = false;	//reset condition of flag
			String cont = scan.nextLine();
			if(cont.equals("Y") || cont.equals("y")){
				userEntry();}
			if(cont.equals("N") || cont.equals("n")){
				menu(num);}
			else
			{
				System.out.println("Invalid Entry. Reenter option.");
				flag = true;
			}
		}while(flag);
	}
	
	public static int inputvalidation()	//input validation by turning string to char array then checking each array 
	{
		Scanner scan = new Scanner(System.in);
		String userInput;
		boolean flag = false;
		do{
		flag = false;
		userInput = scan.nextLine();
		char[] test = userInput.toCharArray();
		for(int i = 0; i < test.length; i++)
		{
			char val = test[i];
			if (!(Character.isDigit(val)))
			{
				flag = true ;
				System.out.println("Invlid Entry. Enter a Number.");
				break;
			}
		}
		}while(flag);
		int num = Integer.valueOf(userInput);
		return num;
	}

	public static void endScreen() //terminate program 
	{
		System.out.println("Program end.");
	}
}
