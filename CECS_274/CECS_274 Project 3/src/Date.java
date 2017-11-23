
public class Date 
{
	/**
	 * private data
	 */
	private int month;
	private int day, year;
	
	/**
	 * default constructor
	 */
	public Date()
	{
		month = 01;
		day = 01;
		year = 2016;
		
	}
	
	/**
	 * overloaded constructor
	 * @param m
	 * @param d
	 * @param y
	 */
	public Date(int m, int d, int y)
	{
		while(validation(m, d, y))
		{	
			this.month = m;
			this.day = d;
			this.year = y;
			break;
		}
	}
	
	/**
	 * set day by passing d
	 * @param d
	 */
	public void setDay(int d)
	{
		this.day = d;
	}
	
	/**
	 * set month by passing m
	 * @param m
	 */
	public void setMonth(int m)
	{
		this.month = m;
	}
	
	/**
	 * set year by passing y
	 * @param y
	 */
	public void setYear(int y)
	{
		this.year = y;
	}
	
	/**
	 * gets month value and returns
	 * @return month
	 */
	public int getMonth()
	{
		return month;
	}
	
	/**
	 * gets day value and return
	 * @return
	 */
	public int getDay()
	{
		return day;
	}
	
	/**
	 * gets year value and return
	 * @return
	 */
	public int getYear()
	{
		return year;
	}
	
	/**
	 * description of object
	 */
	public String toString()
	{
		return year + "-" + month + "-" + day; 
	}
	
	/**
	 * private input validation on the passed data, m d and y
	 * @param m
	 * @param d
	 * @param y
	 * @return boolean to see if validation is true/false
	 */
	private Boolean validation(int m, int d, int y)
	{
		Boolean flag = true;
		if(!(m <= 12 && m >= 1)){	
			flag = false;
			System.out.println("Invalid Month, " + m);}
		if(!(d >= 1 && d <=31)){
			flag = false;
			System.out.println("Invalid Day, " + d);}
		if(!(y > 0)){
			flag = false;
			System.out.println("Invalid Year, " + y);}
		return flag;	
	}
}
