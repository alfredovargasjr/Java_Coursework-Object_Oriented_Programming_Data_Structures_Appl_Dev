import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author Alfredo
 * CECS 277
 * Project 8; Hash Map, Movies objects, remapping
 * Susan
 *
 */
public class hashDrvier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		genericHashTable hs = new genericHashTable();
		hs.insert("one", 1);
		hs.insert("two", 2);
		hs.insert("three", 3);
		hs.insert("four", 4);
		hs.insert("aaadfasdf", 4);
		hs.insert("xcasdf", 4);
		Student s1 = new Student("Alfredo", "Vargas", 4.0);
		Student s2 = new Student("Joe", "Vargas", 3.8);
		hs.insert(s1.getFirst(), s1);
		hs.insert(s2.getFirst(), s2);
		Movie m1 = new Movie();
		Movie m2 = new Movie("Ironman 2");
		hs.insert(m1.getID(), m1);
		hs.insert(m2.getID(), m2);
		hs.remove("four");
		hs.remove("Alfredo");
		System.out.println(hs.get("three"));
		System.out.println("Display\n" + hs.toString());
		//System.out.println(hs.get("one"));
	}
}
