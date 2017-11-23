import java.util.*;
import java.io.*;

public class matchingTags {

	public static void main(String[] args) throws FileNotFoundException
	{
		Stack<String> stack = new Stack();
		File inputfile = new File("C://Users//Alfredo//Desktop//htmldoc.txt");
		Scanner inf = new Scanner(inputfile);
		while(inf.hasNext())
		{
			String cont = inf.next();
			if (cont.startsWith("<") && cont.endsWith(">")) {
				if (!stack.empty() && tester(stack.peek(), cont))
					stack.pop();
				else
					stack.push(cont);
			}	
		}
		if (!stack.isEmpty()){
			System.out.println("Error. Tags Dont Match.");
			System.out.println("Error tag(s): " + stack);
		}
		else
			System.out.println("Tags Match.");
	}

	/**
	 * test to see if the pair make an acceptable pair
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean tester(String a, String b) {
		String pair = "" + a + b;
		String[] test = new String[6];
		test[0] = "<body></body>";
		test[1] = "<center></center>";
		test[2] = "<h1></h1>";
		test[3] = "<p></p>";
		test[4] = "<ol></ol>";
		test[5] = "<li></li>";
		for (int i = 0; i < test.length; i++) {
			if (pair.equals(test[i]))
				return true;
		}
		return false;
	}
}