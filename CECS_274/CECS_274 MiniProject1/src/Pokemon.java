
public class Pokemon 
{
	private String name;
	private int number;
	
	/**
	 * Default constructor
	 */
	public Pokemon()
	{
		name = "Charmander";
		number = 4;
	}
	
	/**
	 * Overloaded constructor
	 * @param n
	 * @param num
	 */
	public Pokemon(String n, int num)
	{
		name = n;
		number = num;
	}
	
	/**
	 * to set name with string input
	 * @param uname
	 */
	public void setName(String uname)
	{
		this.name = uname;
	}
	
	/**
	 * to set number of object using int input
	 * @param nums
	 */
	public void setNumber(int nums)
	{
		this.number = nums;
	}
	
	/**
	 * return name of object
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * return number of object
	 * @return
	 */
	public int getNumber()
	{
		return number;
	}
	
	/**
	 * returns name and number of object
	 */
	public String toString()
	{
		return   "\n  Name: " + name +
				 "\n  Number: " + number;
	}
}
