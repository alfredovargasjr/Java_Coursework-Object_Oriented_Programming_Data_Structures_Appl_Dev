
public class Clock {
	
	/*
	 * return the hours using java implemented api
	 */
	public int getHours()
	{
		return java.time.LocalTime.now().getHour();
	}
	
	public int getMinutes()
	{
		return java.time.LocalTime.now().getMinute();
	}
	
	public String getTime()
	{
		return (getHours() < 10 ? "0" : "") + getHours() + ":" + (getMinutes() < 10 ? "0" : "") + getMinutes() 
				+ (alarmSet ? ifAlarm() : "");
	}
	
	/**
	 * if the time is >= to the alarm, then it will display alarm!
	 * @param h
	 * @param m
	 */
	private boolean alarmSet;
	private int alarmHour;
	private int alarmMin;
	public void setAlarm(int h, int m)
	{
		alarmSet = true;
		alarmHour = h;
		alarmMin = m;
	}
	
	/**
	 * ifAlarm is true, then return ALARM!
	 * clear alarm set
	 * @return
	 */
	public String ifAlarm()
	{
		alarmSet = false;
		if(alarmMin <= getMinutes() && alarmHour <= getHours()){
			return "\tALARM!!!!!";
		}
		return "";
	}

}
