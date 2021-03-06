
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator{
	
	public static void main(String[] args) {
		 // Use a customized Comparator for Strings
		 Comparator<String> compStr = new StringComparator();
		 // Sort and search an "array" of Strings
		 // Add more elements to your array
		 String[] array = {"Hello", "Hi", "HI", "hello", "a", "A", "b", "B"};
		 Arrays.sort(array, compStr);
		 System.out.println(Arrays.toString(array));
		 System.out.println(Arrays.binarySearch(array, "Hello", compStr));
		 System.out.println(Arrays.binarySearch(array, "HELLO", compStr));
		 }
	
}
