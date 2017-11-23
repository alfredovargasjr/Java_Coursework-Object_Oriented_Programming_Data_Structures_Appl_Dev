/**
 * Alfredo Vargas
 * CECS 277
 * Project 5: Encryptor and Decryptor
 * Susan
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.*;
public class Decryptor {

	public static void main(String[] args) 
	{	
		menu();
		System.out.println("Progam Exit.");
	}
	
	/**
	 * menu of options
	 * decrypt or encrypt a file
	 * 
	 */
	public static void menu()
	{
		boolean flag;
		do{
			flag = false;
			System.out.println("Menu: \n[1] Encrypt File\n[2] Decrypt File\n[0] Exit");
			switch(getInt()){
			case 1:
				EncryptFile();
				break;
			case 2: 
				DecryptFile();
				break;
			case 0:
				flag = true;
				break;
			default:
				System.out.println("\nInvalid Option. Re-Enter.");	
				flag = false;
			}
		}while(!flag);
	}
	
	/**
	 * read file to encrypt it
	 * enter the number of shifts for the encryption
	 * takes the line as string and then converts to char array to set the offset
	 */
	public static void EncryptFile()
	{
		File inputFile = readFile();
		if(inputFile != null){
		int shift;	//shift determine by how much the letters wil be encryted, caesars cipher
		System.out.println("Enter the number of shifts to encrypt.");
		shift = getInt();
		Scanner inFile = null;
		try{
			inFile = new Scanner(inputFile);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		String line;
		char[] lineChar;
		char c;
		int charInt;
		PrintWriter outFile = null;
		try {
			outFile = new PrintWriter("EncryptedFile.txt");
			while(inFile.hasNextLine())
			{
				line = inFile.nextLine();
				lineChar = line.toCharArray();
				for(int i = 0; i < lineChar.length; i++){
					if(Character.isAlphabetic(lineChar[i])){
						c = Character.toUpperCase(lineChar[i]);
						charInt =  c - 65;
						charInt = (charInt + shift) % 26;
						charInt = charInt + 65;
						lineChar[i] = (char) charInt;
					}
				}
				line = String.valueOf(lineChar);
				outFile.println(line);
			}
			System.out.println("Encrypted File Created.");
			outFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("Output File Cant be Created.");
		}	
		}
	}
	
	/**
	 * decrypt the file
	 * read a file and decrypts it if it is encrypted.
	 */
	public static void DecryptFile()
	{
		File inputFile = readFile();
		if(inputFile != null){
		LetterFrequency freq = new LetterFrequency(inputFile);	//find the letter freq of text
		freq.getLetterFrequency();
		int shift = 4 - freq.getHighestFreq();	//find the offset of the shift
		Scanner inFile = null;
		try{
			inFile = new Scanner(inputFile);
			String line;
			char[] lineChar;
			char c;
			int charInt;
			PrintWriter outFile = null;
			try {
				outFile = new PrintWriter("DecryptedFile.txt");
				while(inFile.hasNextLine())
				{
					line = inFile.nextLine();
					lineChar = line.toCharArray();
					for(int i = 0; i < lineChar.length; i++){
						if(Character.isAlphabetic(lineChar[i])){
							c = Character.toUpperCase(lineChar[i]);
							charInt =  c - 65;
							if((charInt + shift) < 0)
								charInt = 91 + (charInt + shift);
							else{
								charInt = (charInt + shift) % 26;
								charInt = charInt + 65;
							}
							lineChar[i] = (char) charInt;
						}
					}
					line = String.valueOf(lineChar);
					outFile.println(line);
				}
				System.out.println("Decrypted File Created.");
				outFile.close();
			} catch (FileNotFoundException e) {
				System.out.println("Output File Cant be Created.");
			}	
		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		catch(NullPointerException ex){
			System.out.println("File not found.");
		}
		}
		
	}
	
	/**
	 * prompt the user for the file name
	 * read the file if accessible
	 * if not found return null
	 * @return
	 */
	public static File readFile()
	{
		Scanner in = new Scanner(System.in);
		String fileName;
		boolean flag;
		do{
			flag = false;
			System.out.println("Enter the File Name.");
			fileName = in.next();
			if(!fileName.matches("(/*\\w+\\.txt)$")){
				System.out.println("\nInvalid Text File Name.");
				flag = true;
			}
		}while(flag);
		File inputFile = null;
		try{
			inputFile = new File(fileName);
			Scanner scnFile = new Scanner(inputFile);
			return inputFile;
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found.");
		}
		return null;
	}
	
	/**
	 * input validation for int
	 * @return valid entry
	 */
	public static int getInt()
	{
		boolean flag;
		int choice = 0;
		Scanner in = new Scanner(System.in);
		do{
			flag = false;
			try{
				System.out.print("\nChoice: ");
				choice = in.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("\nInvalid input. Enter Integer.");
				flag = true;
			}
			finally
			{
				in.reset();
				in.nextLine();
			}
		}while(flag);
		return choice;
	}
}
