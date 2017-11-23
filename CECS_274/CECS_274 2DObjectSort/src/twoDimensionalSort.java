import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class twoDimensionalSort {

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Pokemon[][] twoArray = new Pokemon[100][100];
		System.out.println("Enter the number of rows for the 2D array.");
		int numRows = inputValidation();
		System.out.println("Enter the number of columns for the 2D array.");
		int numCol = inputValidation();
		Pokemon[][] twoPArray = new Pokemon[numRows][numCol];
		Pokemon[] temp = new Pokemon[numRows*numCol];
		temp = getNames(numRows*numCol); 
		Pokemon[] t = insertionSort(temp);	//sort array by name in 1d array

		int j = 0;
		for(int r = 0; r < twoPArray.length; r++)
			for(int c = 0; c < twoPArray[0].length; c++)
			{
				twoPArray[r][c] = t[j];
				j++;
			}
		for(int k = 0; k < twoPArray.length; k++)
		{
			for(int i = 0; i < twoPArray[0].length; i++)
			{
				System.out.printf("%-20s", twoPArray[k][i]);
			}
			System.out.println();
		}
		
	}
	
	/**
	 * gets the items from the file and stores them in an array, trims array in the process
	 * @param ds
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Pokemon[] getNames(int ds) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		File inputfile = new File("C://Users//Alfredo//Desktop//pokemon.txt");
		Scanner inF = new Scanner(inputfile);
		Pokemon[] pokemon = new Pokemon[101]; //place all file objects in an array
		int i = 0;
		while (inF.hasNext())
		{
			pokemon[i] = new Pokemon(inF.nextLine());
			i++;
			
		}
		Pokemon[] tt = new Pokemon[i];	//array of total pokemon 
		for(int h = 0; h < tt.length; h++)
		{
			tt[h] = pokemon[h];
		}
		Pokemon[] ord = new Pokemon[ds];
		for(int p = 0; p < ord.length; p++)
		{
			ord[p] = tt[p];
		}
		return ord;
	}
	
	/**
	 * sort the objects by name in increasing order 
	 * @param p
	 * @return
	 */
	public static Pokemon[] insertionSort(Pokemon[] p) {
		for (int k = 1; k < p.length; k++) 
		{
			Pokemon cur = p[k];
			int charPos = 0;
			int j = k; // find correct index j for cur
			while (j > 0 && p[j - 1].getName().charAt(charPos) >= cur.getName().charAt(charPos)) 
			{
				if (cur.getName().charAt(charPos) == p[j - 1].getName().charAt(charPos)) 
				{
					while (cur.getName().charAt(charPos) == p[j - 1].getName().charAt(charPos)) 
					{
						charPos++;
					}
					if (cur.getName().charAt(charPos) < p[j - 1].getName().charAt(charPos)) 
					{
						p[j] = p[j - 1]; 
						j--;
						charPos = 0;
					}
				} 
				else 
				{
					p[j] = p[j - 1]; // slide data[j-1] rightward
					j--;
				}
			}
			p[j] = cur;
		}
		return p;
	}
	
	/**
	 * input validation
	 * @return
	 */
	public static int inputValidation() {
		Scanner scan = new Scanner(System.in);
		boolean flag;
		int num;
		do {
			flag = false;
			num = scan.nextInt();
			if (num < 1) {
				System.out.println("Invalid Input.");
				flag = true;
			}
		} while (flag);
		return num;
	}

}
