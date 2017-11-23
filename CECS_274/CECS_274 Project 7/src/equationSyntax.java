import java.util.*;
public class equationSyntax 
{
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack();
		System.out.println("Enter an equation.");
		String equation = scan.nextLine();
		for(int i = 0; i < equation.length(); i++)
		{
			char c = equation.charAt(i);
			if(c == '[' || c == ']' || c == '{' || c == '}' || c == '(' || c == ')' )
			{
				if(!stack.empty() && tester(stack.peek(), c))
					stack.pop();
				else
					stack.push(c);
			}
		}
		if(!stack.isEmpty())
			System.out.println("Syntax Error.");
		else
			System.out.println("Correct Syntax.");
	}
	
	/**
	 * test to see if the pair make an acceptable pair
	 * @param a
	 * @param b
	 * @return 
	 */
	public static boolean tester(char a, char b)
	{
		String pair = "" + a + b;
		String[] test = new String[3];
		test[0] = "{}";
		test[1] = "[]";
		test[2] = "()";
		for(int i = 0; i < test.length; i++)
		{
			if(pair.equals(test[i]))
				return true;
		}
		return false;
	}

}
