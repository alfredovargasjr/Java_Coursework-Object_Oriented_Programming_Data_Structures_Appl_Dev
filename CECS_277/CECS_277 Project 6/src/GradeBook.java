
/**
 * @author Alfredo
 *CECS 277
 *Lab 5: Map and gradebook
 *Susan
 */

import java.util.HashMap;
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
		 Map<Student, String > studentGrade = new HashMap<Student, String>();	//Unsorted map. Key = Student obj, Val = string grade
		 Map<String, Student> stringStudent = new TreeMap<String, Student>();	//sorted map. key = Student to string (for sorting), val = student obj
		 Map<Integer, Student> idStudents = new TreeMap<Integer, Student>();	//sorted map. key = integer id, val = Student obj
		 Student s;
		 boolean done = false;
		 while(!done)
		 {
		//menu
		 System.out.println("A)dd R)emove M)odify P)rint Q)uit");
		 String input = in.next().toUpperCase();
		 if (input.equals("A"))
		 {
			 s = new Student(setStudentFirstName(), setStudentLastName()); //create student object
			 idStudents.put(s.getID(), s);	//get student id, put student object as value
			 stringStudent.put(s.getLast() + s.getFirst() + s.getID(), s); //sort students by last -> name ->id
			 studentGrade.put(s, setStudentGrade());	//put student into map, value is grade
		 }
		 else if (input.equals("R"))
		 {
			 if(idStudents.isEmpty())
				 System.out.println("No Stundets in Gradebook.");
			 else{
			 s = idStudents.get(inputStudentID());
			 stringStudent.remove(s.getLast() + s.getFirst() + s.getID());
			 idStudents.remove(s.getID());
			 }
		 }
		 else if (input.equals("M"))
		 {
			 try{
			 s = idStudents.get(inputStudentID());
			 studentGrade.replace(s, setStudentGrade());
			 }catch (NullPointerException e){
				 System.out.println("ID Not found.");
			 }
		 }
		 else if (input.equalsIgnoreCase("P"))
		 {
			 if(stringStudent.isEmpty())
				 System.out.println("No Students in Gradebook.");
			 for(String j : stringStudent.keySet())
				 System.out.println(stringStudent.get(j) + "\nGrade: " + studentGrade.get(stringStudent.get(j)));
		 }
		 else if (input.equalsIgnoreCase("Q")){
			 done = true;
			 System.out.println("Program Exit.");
		 }
		 else{
			 System.out.println("Invalid Entry. Re-enter");
			 done = false;
			 in.nextLine();
		 }
		}
		}
	
	//return the string, student first name
	public static String setStudentFirstName(){
		boolean flag;
		Scanner in = new Scanner(System.in);
		String s = null;
		do{
			flag = false;
		try{
			System.out.println("Enter Student First Name: ");
			s = in.next();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Entry. Re-enter.");
			in.next();
			flag = true;
		}
		}while(flag);
		return s;
	}
	/*
	 * return student last name
	 */
	public static String setStudentLastName(){
		boolean flag;
		Scanner in = new Scanner(System.in);
		String s = null;
		do{
			flag = false;
		try{
			System.out.println("Enter Student Last Name: ");
			s = in.next();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Entry. Re-enter.");
			in.next();
			flag = true;
		}
		}while(flag);
		return s;
	}
	//return the string, student grade
	public static String setStudentGrade(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Grade: ");
		return in.next();
	}
	/*
	 * prompt user for student id
	 * return int, ID
	 */
	public static int inputStudentID(){
		boolean flag;
		Scanner in = new Scanner(System.in);
		int s = 0;
		do{
			flag = false;
		try{
			System.out.println("Enter Student ID: ");
			s = in.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Entry. Re-enter.");
			in.nextLine();
			flag = true;
		}
		}while(flag);
		return s;
	}
}
