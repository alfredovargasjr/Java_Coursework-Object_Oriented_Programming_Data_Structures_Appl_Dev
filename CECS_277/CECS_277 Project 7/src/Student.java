
public class Student implements Measurable {
	private String first;
	private String last;
	private int id;
	private double gpa;
	private static int number;
	
	/*
	 * default constructor, student name and last name
	 */
	public Student(String f, String l){
		first = f;
		last = l;
		id = genID();
	}
	/*
	 * overloaded; pass first, last, and student id
	 */
	public Student(String f, String l, int n){
		first = f;
		last = l;
		id = n;
	}
	
	public Student(String f, String l, double n){
		first = f;
		last = l;
		id = genID();
		gpa = n;
	}
	/*
	 * return the first name
	 */
	public String getFirst(){
		return first;
	}
	/*
	 * set first to f
	 */
	public void setFirst(String f){
		first = f;
	}
	/*
	 * return last 
	 */
	public String getLast(){
		return last;
	}
	/*
	 * set last to l
	 */
	public void setLast(String l){
		last = l;
	}
	/*
	 * return ID
	 */
	public int getID(){
		return id;
	}
	/*
	 * set ID to n
	 */
	public void setID(int n){
		id = n;
	}
	/*
	 * create unique id based on the number of students, incriment number
	 */
	public int genID(){
		return ++number;
	}
	
	public double getGPA(){
		return gpa;
	}
	/*
	 * return comparable, for implemented method getMeasure()
	 * @see Measurable#getMeasure()
	 */
	public Comparable getMeasure(){
		return gpa;
	}
	
	@Override
	public String toString(){
		return "\nName: " + last + ", " + first + "\nID: " + id + "\nGPA: " + gpa; 
	}
	

}
