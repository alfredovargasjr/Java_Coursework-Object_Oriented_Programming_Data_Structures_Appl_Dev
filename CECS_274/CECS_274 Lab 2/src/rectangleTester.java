/**@author Alfredo
 * CECS 274
 *Lab 2
 */
public class rectangleTester 
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//object for Rectangle class
		Rectangle r1 = new Rectangle();
		System.out.println("length: " + r1.getLength() + " width: " + r1.getWidth()
							+ " color: " + r1.getColor() + " area: " + r1.getArea());
		//data modifier
		r1.setWidth(99);
		System.out.println("length: " + r1.getLength() + " width: " + r1.getWidth()
		+ " color: " + r1.getColor() + " area: " + r1.getArea());
		
		Rectangle r2 = new Rectangle(5.0, 6.0, "blue");
		System.out.println("length: " + r2.getLength() + " width: " + r2.getWidth()
		+ " color: " + r2.getColor() + " area: " + r2.getArea());	
	}
}
