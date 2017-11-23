
public class Time 
{
	/**
	 * private data 
	 */
	private int hours, minutes, seconds;
	
	/**
	 * default constructor
	 */
	public Time()
	{
		hours = 12;
		minutes = 00;
		seconds = 00;
	}
	
	/**
	 * overloaded constructor with passed values
	 * @param h
	 * @param m
	 * @param s
	 */
	public Time(int h, int m, int s)
	{
		while(validation(h, m, s)){
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
		break;
		}
	}
	
	/**
	 * set hours to passed value
	 * @param h
	 */
	public void setHours(int h)
	{
		this.hours = h;
	}
	
	/**
	 * set minutes to passed m
	 * @param m
	 */
	public void setMinutes(int m)
	{
		this.minutes = m;
	}
	
	/**
	 * set seconds to passed s
	 * @param s
	 */
	public void setSeconds(int s)
	{
		this.seconds = s;
	}
	
	/**
	 * get hours and return
	 * @return
	 */
	public int getHours()
	{
		return hours;
	}
	
	/**
	 * get minutes and return
	 * @return
	 */
	public int getMinutes()
	{
		return minutes;
	}
	
	/**
	 * get seconds and return
	 * @return
	 */
	public int getSeconds()
	{
		return seconds;
	}
	
	/**
	 * description of object Time
	 */
	public String toString()
	{
		return hours + ":" + minutes + ":" + seconds;
	}
	
	/**
	 * validate if passed value in overloaded constructor are valid
	 * @param hr
	 * @param min
	 * @param sec
	 * @return boolean true/false
	 */
	private boolean validation(int hr, int min, int sec)
	{
		boolean flag = true;
		if(!(hr >= 0 && hr <=24)){
			flag = false;
			System.out.println("Invalid Hour," + hr);}
		if(!(min >= 0 && min <= 60)){
			flag = false;
			System.out.println("Invalid Minute, " + min);}
		if(!(sec >= 0 && sec <= 60)){
			flag = false;
			System.out.println("Invalid Second., " + sec);}
		return flag;
	}
}
