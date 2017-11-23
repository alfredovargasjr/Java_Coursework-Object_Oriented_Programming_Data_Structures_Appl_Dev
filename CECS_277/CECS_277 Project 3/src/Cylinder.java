
public class Cylinder extends Circle implements Movable {
	
	private double height;

	/**
	 * default constructor 
	 */
	public Cylinder() {
		super();
		height = 6;
	}
	
	/**
	 * overloaded constructor
	 * passes radius and color to super
	 * @param h
	 * @param r
	 * @param c
	 */
	public Cylinder(double h, double r, String c)
	{
		super(r, c);
		height = h;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public int hashCode()
	{
		return (int) (5 * height + 4 * getSurfaceArea() + 3 * getVolume() + 2 * super.getArea()); 
	}
	
	public boolean equals(Object o)
	{
		if(o == this)
			return true;
		else if(o == null || o.getClass() != this.getClass())
			return false;
		else{
			Cylinder c = (Cylinder) o;
			return c.getSurfaceArea() == this.getSurfaceArea() && c.getVolume() == this.getVolume();
		}
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

	@Override
	public double getVolume() {
		return super.getArea() * height;
	}
	
	public double getSurfaceArea() {
		return (2 * Math.PI * super.getRadius() * height) + (2 * super.getArea());
	}
	
	@Override
	public String toString()
	{
		return "\nCylinder\n" + super.toString() + "\nHeight: " + height 
								+ "\nSurfaceArea: " + getSurfaceArea()
								+ "\nVolume: " + getVolume();
	}

}
