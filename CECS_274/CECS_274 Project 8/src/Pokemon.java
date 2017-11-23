
public class Pokemon 
{
	private String name;
	private int number;
	
	public Pokemon(String n, int num)
	{
		name = n;
		number = num;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setNumber(int n)
	{
		this.number = n;
	}
	
	public String getName()
	{
		return name;
	}

	public int getNumber()
	{
		return number;
	}
	
	public String toString()
	{
		return  name + " " + number;
	}
}
