import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LetterFrequency {
	
	public int numberOfLetters;
	public int[] letters = new int[26];	//array of letters of the alphabet. A = 0, B = 1, Z = 25
	
	public LetterFrequency(File inputFile)
	{
		//File inputFil = new File("text.txt");
		letters[0] = 0;
		readFile(inputFile);
	}
	
	/**
	 * reads the input file
	 * send the string line to the letter method
	 * @param inFile
	 */
	public void readFile(File inFile)
	{
		Scanner in = null;
		try{
			in = new Scanner(inFile);
			System.out.println("File found. Finding the Letter Frequecny...\n");
			while(in.hasNext())
			{
				readLetters(in.nextLine());
			}
		} 
		catch(IOException ex){
			System.out.println("File not found.");
		} 
		catch(NullPointerException e){
			System.out.println("File not found.");
		}
	}
	
	/**
	 * read the char of the string
	 * if the char is letter, then toUpper and incriment the number of letter
	 * @param s
	 */
	public void readLetters(String s)
	{
		char[] line = s.toCharArray();
		char c;
		for(int i = 0; i < line.length; i++)
		{
			c = line[i];
			if(!java.lang.Character.isAlphabetic(c));	//test to see if char is a letter, exclude spaces and punctuation
			else{
				c = Character.toUpperCase(line[i]);	//convert char to uppercase
				numberOfLetters++;	//add to the total number of letters
				letters[c - 65]++;	//increment the number of letter
			}
		}
	}
	
	/**
	 * 
	 * @return the number of letters
	 */
	public int getNumberOfLetters()
	{
		return numberOfLetters;
	}
	
	/**
	 * find the letter with the highest frequency
	 * @return int of letter, A = 0,  B = 1, Z = 2
	 */
	public int getHighestFreq()
	{
		int greatest = 0;
		int offset = 0;
		for(int i = 0; i < letters.length; i++)
			if((letters[i] > greatest)){
					greatest = letters[i];
					offset = i;
			}
		return offset;
	}
	
	public void getLetterFrequency()
	{
		int c = 65;
		double num;
		for(int i = 0; i < letters.length; i++){
			num = letters[i] / (double)numberOfLetters;
			System.out.printf("%s%4.1f%s", (char) c + ":", num * 100, "%\t\t");
			c++;
			if((i + 1) % 5 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
