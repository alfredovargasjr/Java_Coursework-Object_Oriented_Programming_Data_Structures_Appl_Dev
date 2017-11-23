
public class Pokemon 
{
	/**
	 * Private Data types
	 */
	private String name;
	private int number;
	
	/**
	 * default constructor
	 */
	public Pokemon()
	{
		name = "Bulbasaur";
		number = 1;
	}
	
	/**
	 * overloaded constructor
	 * @param pname
	 * @param num
	 */
	public Pokemon(String pname, int num)
	{
		name = pname;
		number = num;
	}
	
	/**
	 * set name
	 * @param uname
	 */
	public void setName(String uname)
	{
		this.name = uname;
	}
	
	/**
	 * setNum
	 * @param nums
	 */
	public void setNumber(int nums)
	{
		this.number = nums;
	}
	
	/**
	 * get name 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * get num
	 * @return
	 */
	public int getNumber()
	{
		return number;
	}
	
	/**
	 * return string of description
	 */
	public String toString()
	{
		return "\tPokemon: " + name + "\n\tNumber: " + number;
	}
	
	

}
