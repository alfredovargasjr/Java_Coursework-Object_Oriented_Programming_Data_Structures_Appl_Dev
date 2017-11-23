
public class Cube extends Rectangle {
	
	private double height;

	//special rectangle case, cube
	public Cube() {
		super(3);
		height = 3;
	}
	
	public Cube(double l)
	{
		super(l);
		height = l;
	}

	public double getHeight()
	{
		return height;
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
			Cube c = (Cube) o;
			return c.getSurfaceArea() == this.getSurfaceArea() && c.getVolume() == this.getVolume();
		}
	}

	@Override
	public double getVolume() {
		return super.getArea() * height;
	}

	@Override
	public double getSurfaceArea() {
		return super.getArea() * 6.0;
	}
	
	@Override
	public String toString()
	{
		return "\nCube" + super.toString() 
			 + "\nHeight: " + height 
			 + "\nSurfaceArea: " + getSurfaceArea()
			 + "\nVolume: " + getVolume();
	}

}
