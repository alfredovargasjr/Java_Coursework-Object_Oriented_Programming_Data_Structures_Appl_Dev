
public abstract class Rectangle extends Shape implements Movable {
	
	private double length;
	private double width;

	public Rectangle()
	{
		super();
		length = 6;
		width = 2;
		
	}
	
	/**
	 * for special square case
	 * width and length take some value
	 * @param l
	 * @param w
	 */
	public Rectangle(double l)
	{
		super();
		width = l;
		length = l;
	}
	public Rectangle(double w, double l)
	{
		super();
		width = w;
		length = l;
	}
	public Rectangle(double w, double l, String c)
	{
		super(c);
		length = l;
		width = w;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public double getArea()
	{
		return width * length;
	}
	
	@Override 
	public String toString()
	{
		return super.toString() + "\nWidth: " + width + "\nLength: " + length;
	}

	@Override
	public void left(int l)
	{
		super.getCenter().setX(super.getCenter().getX() - l);
	}
	
	@Override
	public void right(int r)
	{
		super.getCenter().setX(super.getCenter().getX() + r);
	}
	
	@Override
	public void up(int u)
	{
		super.getCenter().setY(super.getCenter().getY() + u);
	}
	
	@Override 
	public void down(int d)
	{
		super.getCenter().setY(super.getCenter().getY() - d);
	}
}
