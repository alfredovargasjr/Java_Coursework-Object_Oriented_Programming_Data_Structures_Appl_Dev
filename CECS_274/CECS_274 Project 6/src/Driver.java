import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		//ArrayList<Pokemon> A = new ArrayList<>();
//		A.add(new Pokemon("X"));
//		A.add(new Pokemon("Y"));
//		A.add(new Pokemon("Z"));
//		ArrayList<Pokemon> B = new ArrayList<>();
//		ArrayList<Pokemon> C = new ArrayList<>();
		towerOfHanoi toh = new towerOfHanoi();
////		System.out.print("Enter number of discs: ");
////		Scanner scanner = new Scanner(System.in);
//		int discs = scanner.nextInt();
		int discs = 2;
		toh.solve(discs, toh.getListA(), toh.getListB(), toh.getListC());
		System.out.println(toh.getListC());
	}
	
	public Pokemon[] getNames() throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		File inputfile = new File("C://Users//Alfredo//Desktop//pokemon.txt");
		Scanner inF = new Scanner(inputfile);
		Pokemon[] pokemon = new Pokemon[inputValidation()];
		int i = 0;
		while (inF.hasNext())
		{
			pokemon[i] = new Pokemon(inF.next());
			i++;
		}
		return pokemon;
	}
	
	public int inputValidation()
	{
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		int num = 1;
		do{
		flag = false;
		System.out.println("Enter the number of objects. [1 - 8]");
		String choice = scan.nextLine();
		if(!Character.isDigit(choice.charAt(0)))
			flag = true;
		else{
			num = Integer.valueOf(choice);
			if(num < 1 || num > 8)
				flag = true;
		}
		}while(flag);
		return num;
	}

}
