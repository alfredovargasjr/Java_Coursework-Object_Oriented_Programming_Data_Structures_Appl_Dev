
/**
 * @author Alfredo
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class shapeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Circle[] circles = new Circle[2];
		circles[0] = new Cylinder();
		circles[1] = new Cone();
		Rectangle[] rects = new Rectangle[3];
		rects[0] = new Cube();
		rects[1] = new Pyramid();
		rects[2] = new RectPrism();
		System.out.println(rects[0].equals(rects[1]));
		for(int i = 0; i < circles.length; i++)
			if(circles[i] instanceof Circle)
				System.out.println("True");
			else
				System.out.println("False");
		
		
		Shape s = new Cube();
		boolean flag;
		do{
		flag = false;
		switch(shapeChoice()){
		case 1:
			s = circles[0];
			break;
		case 2:
			s = circles[1];
			break;
		case 3:
			s = rects[0];
			break;
		case 4:
			s = rects[1];
			break;
		case 5:
			s = rects[2];
			break;
		default:
			System.out.println("Invalid choice. Re-enter.");
			flag = true;
		}
		}while(flag);
		
		do{
			System.out.println(s.toString());
			flag = false;
			switch(moveMenu()){
			case 1:
				s.up(1);
				break;
			case 2:
				s.down(1);
				break;
			case 3: 
				s.left(1);
				break;
			case 4:
				s.right(1);
				break;
			case 0:
				System.out.println("Program Exit.");
				flag = true;
			}
		}while(!flag);

	}
	
	/**
	 * input validation, return int using try/catch
	 * @return
	 */
	public static int moveMenu()
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		boolean flag;
		do {
			flag = false;
			try {
				System.out.println("\nMenu: \n" + "[1] Up\n" + "[2] Down\n" + "[3] Left\n" + "[4] Right\n" + "[0] Exit\n");
				choice = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Re-enter.");
				scan.next();
				flag = true;
			} finally {
			}
		} while(flag);
		return choice;
	}
	
	public static int shapeChoice()
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		boolean flag;
		do {
			flag = false;
			try {
				System.out.println("Shape: \n[1] Cylinder \n[2] Cone \n[3] Cube \n[4] Pyramid \n[5] Rectangular Prism");
				choice = scan.nextInt();
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Re-enter.");
				scan.next();
				flag = true;
			} finally {
			}
		} while(flag);
		return choice;
	}

}
