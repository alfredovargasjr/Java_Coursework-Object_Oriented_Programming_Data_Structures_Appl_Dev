
public abstract class Circle extends Shape implements Movable {
	
	private double radius;

	public Circle() {
		super();
		this.radius = 2;
	}
	
	public Circle(double r, String c)
	{
		super(c);
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public String getColor()
	{
		return super.getColor();
	}
	
	public Point getCenter()
	{
		return super.getCenter();
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nRadius: " + radius;
	}

}
