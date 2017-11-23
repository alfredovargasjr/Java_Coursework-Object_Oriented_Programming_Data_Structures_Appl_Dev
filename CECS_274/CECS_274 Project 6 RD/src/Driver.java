import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		int discs = inputValidation();
		Pokemon[] p = getNames(discs);
		TowerOfHanoi towersOfHanoi = new TowerOfHanoi(discs, p);
		towersOfHanoi.solve(discs, "A", "B", "C");
	}
	
	/**
	 * read from file, sort array, then set to wanted size
	 * @param ds
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Pokemon[] getNames(int ds) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		File inputfile = new File("C://Users//Alfredo//Desktop//pokemon.txt");
		Scanner inF = new Scanner(inputfile);
		Pokemon[] pokemon = new Pokemon[100];
		int i = 0;
		while (inF.hasNext())
		{
			pokemon[i] = new Pokemon(inF.next());
			i++;
		}
		Pokemon[] tt = new Pokemon[i];
		for(int h = 0; h < tt.length; h++)
		{
			tt[h] = pokemon[h];
		}
		Pokemon[] ord = new Pokemon[ds];
		ord = Pokemon.NameOrder(tt);
		Pokemon[] temp = new Pokemon[ds];
		for(int j = 0; j < ds; j++)
		{
			temp[j] = ord[j];
		}
		return temp;
	}
	
	/**
	 * input checking, within range
	 * @return
	 */
	public static int inputValidation()
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
