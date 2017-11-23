
public class RectPrism extends Rectangle {
	
	private double height;

	/**
	 * default constructor
	 */
	public RectPrism() {
		super();
		height = 2;
	}
	
	public RectPrism(double h)
	{
		super();
		height = h;
	}
	
	public RectPrism(double h, double w, double l)
	{
		super(w, l);
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
			RectPrism c = (RectPrism) o;
			return c.getSurfaceArea() == this.getSurfaceArea() && c.getVolume() == this.getVolume();
		}
	}
	
	@Override
	public double getSurfaceArea()
	{
		return (super.getArea() * 2.0) + (2.0 * height * (super.getWidth() + super.getLength()));  
	}
	
	@Override
	public double getVolume()
	{
		return super.getArea() * height;
	}
	
	@Override
	public String toString()
	{
		return "\nRectangular Prism " + super.toString() 
					+ "\nHeight:" + height 
					+ "\nSurfaceArea: " + getSurfaceArea()
					+ "\nVolume: " + getVolume();
	}

}
