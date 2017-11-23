
public class Country implements Measurable {
	 
	private String name;    
	private double area;  
	public Country(String aName, double anArea) {       
		name = aName;       
		area = anArea;   
		}  
	public String getName() { 
		return name; 
		}    
	public double getArea() { 
		return area; 
		}
	/*
	 * return comparable, for implemented method getMeasure()
	 * @see Measurable#getMeasure()
	 */
	public Comparable getMeasure() { 
		return area; 
		} 
}
