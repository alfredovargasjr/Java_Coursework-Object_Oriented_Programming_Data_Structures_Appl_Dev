
abstract public class Shape implements Movable{
	
	//private data members 
	private String color;
	private Point center;
	
	/**
	 * default constructor
	 * create Point object, center at (0,0)
	 */
	public Shape()
	{
		this.color = "Blue";
		this.center = new Point();
	}
	
	/**
	 * overloaded 
	 * create Point object, set at location (0,0)
	 * @param c
	 */
	public Shape(String c)
	{
		this.color = c;
		this.center = new Point();
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String c)
	{
		color = c;
	}
	
	public Point getCenter()
	{
		return center;
	}
	
	@Override
	public String toString()
	{
		return "\nColor: " + color + "\nCenter " + center.toString();
	}
	
	abstract public double getVolume();
	abstract public double getSurfaceArea();
}
