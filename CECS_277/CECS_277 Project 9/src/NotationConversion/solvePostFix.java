package NotationConversion;

import java.util.Stack;

public class solvePostFix {
	/**
	 * private data members
	 * string, and the result
	 */
	private String s;
	private double result;
	
	solvePostFix(String st, int i){
		s = st;
		if(s != null && s.length() != 0){
			if(i == 1)
				solvepostFix();
			else 
				solvePreFix();
		}
	}
	/**
	 * solve using postfix
	 */
	public void solvepostFix(){
		char[] input = s.toCharArray();
		char c;
		double[] val = new double[2];
		int j = 0;
		Stack<Integer> intStk = new Stack<Integer>();	//a and b, digits for operations 
		Stack<Double> resultStk = new Stack<Double>();
		for(int i = 0; i < input.length; i++){
			if(isOperand(input[i])){
				intStk.push(Character.getNumericValue((input[i])));
			}
			else if(isOperator(input[i])){
				while(!intStk.isEmpty()){
					val[j] = intStk.peek();
					val[j] = intStk.pop();
					if(intStk.isEmpty()){
						if(j > 0){
							resultStk.push(operation(input[i], val[j], val[j - 1]));
							j = 0;
						}
						else if(!resultStk.isEmpty()){
							val[++j] = resultStk.peek();
							resultStk.pop();
							resultStk.push(operation(input[i], val[j], val[j - 1]));
						}
					}
					else {
						j++;
					}
				}
			}
		}
		result = resultStk.peek();
		resultStk.clear();
	}
	/**
	 * solve using prefix 
	 */
	public void solvePreFix(){
		System.out.println("inside");
		s = s + "n";
		System.out.println(s);
		char[] input = s.toCharArray();
		char c;
		double[] val = new double[2];
		int j = 0;
		Stack<Character> opStk = new Stack<Character>();	//a and b, digits for operations 
		Stack<Double> resultStk = new Stack<Double>();
		for(int i = 0; i < input.length; i++){
			if(isOperator(input[i]) || input[i] == 'n'){
				if(!opStk.isEmpty()){
					if (isOperator(input[i - 1])){
						opStk.push(input[i]);
					}
					else if (!opStk.empty()) {
						while (!opStk.empty()) {
							for (int k = 0; k < 2; k++) {
								val[k] = resultStk.peek();
								System.out.println("d " + val[k]);
								resultStk.pop();
							}
							resultStk.push(operation(opStk.peek(), val[1], val[0]));
							opStk.pop();
						}
						opStk.push(input[i]);
					}
					else{
						opStk.push(input[i]);
					}
				}
			else
				opStk.push(input[i]);
			}
			else if(isOperand(input[i])){
				resultStk.push(Double.valueOf(Character.getNumericValue(input[i])));
				
				}
			}
		result = resultStk.peek();
		resultStk.clear();
	}
	/**
	 * check to see if it an operand
	 * return bool
	 * @param c
	 * @return
	 */
	public boolean isOperand(char c){
		return Character.isDigit(c);
	}
	/**
	 * check to see if it is an operator
	 * return boolean
	 * @param c
	 * @return
	 */
	public boolean isOperator(char c){
		switch(c){
		case '+':
		case '-':
		case '*': 
		case '/':
		case '%':
		case '^':
			return true;
		default: 
			return false;
		}
	}
	/**
	 * solve the operation
	 * @param s
	 * @param a
	 * @param b
	 * @return
	 */
	public double operation(char s, double a, double b){
		double rslt = 0;
		switch(s){
		case '+':
			rslt = a + b;
			break;
		case '-':
			rslt = a - b;
			break;
		case '*':
			rslt = a * b;
			break;
		case '/':
			rslt = a / b;
			break;
		case '%':
			rslt = (int) a % (int) b;
			break;
		case '^':
			rslt = Math.pow(a, b);
			break;
		default: 
			rslt = 0;
		}
		return rslt;
	}
	/**
	 * 
	 * @return the string value of result double
	 */
	public String getResult(){
		return String.valueOf(result);
	}

}
