
public class Pyramid extends Rectangle {

	private double height;

	/**
	 * create a square base on default
	 * default constructor
	 */
	public Pyramid() {
		super(3);
		height = 4;
	}
	
	/**
	 * create a square base
	 * @param h
	 */
	public Pyramid(double h)
	{
		super(3);
		height = h;
	}
	
	/**
	 * constructor with height, length, width
	 * @param h
	 * @param l
	 * @param w
	 */
	public Pyramid(double h, double l, double w)
	{
		super(w, l);
		height = h;
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
			Pyramid c = (Pyramid) o;
			return c.getSurfaceArea() == this.getSurfaceArea() && c.getVolume() == this.getVolume();
		}
	}

	@Override
	public double getVolume() {
		return (super.getArea() * height) / 3.0;
	}

	@Override
	public double getSurfaceArea() {
		return super.getArea() + (super.getLength() * Math.sqrt((Math.pow(super.getWidth() / 2.0, 2) + Math.pow(height, 2))))
						+ (super.getWidth() * Math.sqrt((Math.pow(super.getLength() / 2.0, 2) + Math.pow(height, 2))));
	}
	
	@Override
	public String toString()
	{
		return "\nPyramid" + super.toString() 
			 + "\nHeight: " + height 
			 + "\nSurfaceArea: " + getSurfaceArea()
			 + "\nVolume: " + getVolume();
	}

}