import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class twoDimensionalSort2D {

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
		Pokemon[][] temp = new Pokemon[numRows][numCol];
		temp = getNames(numRows, numCol);	//gets the objects from file and place them in temp
		Pokemon[][] t = insertionSort(temp);	//sort array by name in 1d array
		for(int r = 0; r < twoPArray.length; r++)
			for(int c = 0; c < twoPArray[0].length; c++)
			{
				twoPArray[r][c] = t[r][c];
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
	public static Pokemon[][] getNames(int r, int c) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		File inputfile = new File("C://Users//Alfredo//Desktop//pokemon.txt");
		Scanner inF = new Scanner(inputfile);
		Pokemon[][] pokemon2d = new Pokemon[r][c]; //place all file objects in an array
		int rw = 0;
		int cl = 0;
		while(inF.hasNext() && (rw < pokemon2d.length))
		{
			if(cl == pokemon2d[0].length)
			{
				rw++;
				cl = 0;
				if(rw == pokemon2d.length)
					break;
			}
			pokemon2d[rw][cl] = new Pokemon(inF.nextLine());
			cl++;
		}
		for(int k = 0; k < pokemon2d.length; k++)
		{
			for(int t = 0; t < pokemon2d[0].length; t++)
			{
				System.out.printf("%-20s", pokemon2d[k][t]);
			}
			System.out.println();
		}
		System.out.println();
		return pokemon2d;
	}
	
	/**
	 * sort the objects by name in increasing order 
	 * @param p
	 * @return
	 */
	public static Pokemon[][] insertionSort(Pokemon[][] p) {
		int row = 0;
		for (int z = 0; z < 50; z++) {
			for (int r = 0; r < p.length; r++) {
				row = r;
				for (int c = 0; c < p[0].length; c++) {
					Pokemon cur = p[r][c];
					int charPos = 0;
					int j = c; // index of col
					if ((r > 0) && (j == 0)) {
						if (cur.getName().charAt(0) <= p[r - 1][p[0].length - 1].getName().charAt(0)) {
							if (cur.getName().charAt(charPos) == p[r - 1][p[0].length - 1].getName().charAt(charPos)) {
								while (cur.getName().charAt(charPos) == p[r - 1][p[0].length - 1].getName()
										.charAt(charPos) && (charPos < 5)) {
									charPos++;
								}
								if (cur.getName().charAt(charPos) < p[r - 1][p[0].length - 1].getName()
										.charAt(charPos)) {
									p[r][j] = p[r - 1][p[0].length - 1];
									p[r - 1][p[0].length - 1] = cur;
									charPos = 0;
								}
							} else {
								p[r][j] = p[r - 1][p[0].length - 1];
								p[r - 1][p[0].length - 1] = cur;
							}
						}
					}
					cur = p[r][c];
					while (j > 0 && p[row][j - 1].getName().charAt(charPos) >= cur.getName().charAt(charPos)) {
						if (cur.getName().charAt(charPos) == p[row][j - 1].getName().charAt(charPos)) {
							while (cur.getName().charAt(charPos) == p[row][j - 1].getName().charAt(charPos)) {
								charPos++;
							}
							if (cur.getName().charAt(charPos) < p[row][j - 1].getName().charAt(charPos)) {
								p[row][j] = p[row][j - 1];
								j--;
								charPos = 0;
							}
						} else {
							p[row][j] = p[row][j - 1]; // slide data[j-1]
														// rightward
							j--;
						}
						p[row][j] = cur;
					}
				}
			}
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
