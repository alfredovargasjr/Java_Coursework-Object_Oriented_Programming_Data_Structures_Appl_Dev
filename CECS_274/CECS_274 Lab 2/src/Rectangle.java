/**@author Alfredo Vargas
 * CECS 274
 * Lab 2
 */
public class Rectangle 
{
	//private data
	private double width, length;
	private String color;
	
	//public members
	public Rectangle()
	{
		width = 1.0;
		length = 2.0;
		color = "red";
	}
	
	/**
	 * 
	 * @param width
	 * @param length
	 * @param color
	 */
	public Rectangle(double width, double length, String color)
	{
		this.width = width;
		this.length = length;
		this.color = color;
	}
	
	//datamodifiers
	/**
	 * 
	 * @param x
	 */
	public void setWidth(double x)
	{
		width = x;
	}
	
	/**
	 * 
	 * @param y
	 */
	public void setLength(double y)
	{
		length = y;
	}
	
	/**
	 * 
	 * @param z
	 */
	public void setColor(String z)
	{
		color = z;
	}
	
	//return values of data
	/**
	 * 
	 * @return
	 */
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getLength()
	{
		return length;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getArea()
	{
		return width * length;
	}
	
	//**@overload
	public String toString()
	{
		return "width: " + width + "length: " + length + "color: " + color;
	}
}
