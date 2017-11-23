
public class Point {
	
	//private data members
	private int x;
	private int y;
	
	/**
	 * default constructor 
	 */
	public Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * overloaded constructor 
	 * @param x
	 * @param y
	 */
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * setters and getters for private data members
	 * @return
	 */
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return "Point: (" + x + "," + y + ")";
	}
}
