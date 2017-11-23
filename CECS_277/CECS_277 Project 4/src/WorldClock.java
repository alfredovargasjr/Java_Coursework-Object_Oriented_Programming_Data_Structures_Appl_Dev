
public class WorldClock extends Clock {
	
	private int minutes;
	private int hours;

	/**
	 * default constructor, will not set an offset for the clock
	 */
	public WorldClock() 
	{
		super();
		minutes = super.getMinutes();
		hours = super.getHours();
		
	}
	
	/**
	 * overloaded, h = offset of clock, for timezone purposes
	 * use parent class to retrieve time
	 * @param h
	 */
	public WorldClock(int h)
	{
		super();
		if(super.getHours() + h >= 24)
			hours = (super.getHours() + h) - 24;
		else 
			hours = super.getHours() + h;
		minutes = super.getMinutes();
	}
	
	@Override
	public void setAlarm(int h, int m)
	{
		if( getHours() >= h && getMinutes() >= m)
			System.out.println("Alarm!!!!!");
	}
	
	@Override
	public int getHours()
	{
		return hours;
	}

	@Override
	public int getMinutes()
	{
		return minutes;
	}
}
