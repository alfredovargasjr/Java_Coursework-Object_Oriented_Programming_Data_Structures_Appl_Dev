
/**
 * @author Alfredo
 *CECS 277
 *Lab 5: Map and gradebook
 *Susan
 */

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class GradeBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//tree map for gradebook
		 Map<String, String> grades = new TreeMap<String, String>();
		 boolean done = false;
		 while(!done)
		 {
		//menu
		 System.out.println("A)dd R)emove M)odify P)rint Q)uit");
		 String input = in.next().toUpperCase();
		 if (input.equals("Q"))
		 {
		 done = true;
		 }
		 else if (input.equals("A"))
		 {
		 grades.put(setStudentName(), setStudentGrade());
		 }
		 else if (input.equals("R"))
		 {
		 grades.remove(setStudentName());
		 }
		 else if (input.equals("M"))
		 {
		 grades.replace(setStudentName(), setStudentGrade());
		 }
		 else if (input.equalsIgnoreCase("P"))
		 {
		 System.out.println("Grades: " + grades.toString());
		 }
		 else
		{
		 done = true;
		}
		}
		}
	//return the string, student name
	public static String setStudentName(){
		System.out.println("Enter Student Name: ");
		Scanner in = new Scanner(System.in);
		return in.next();
	}
	//return the string, student grade
	public static String setStudentGrade(){
		System.out.println("Enter Student Grade: ");
		Scanner in = new Scanner(System.in);
		return in.next();
	}
}
