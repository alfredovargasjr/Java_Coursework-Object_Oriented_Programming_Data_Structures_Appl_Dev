
public class GameDate 
{
	/**
	 * private data
	 */
	private Date gDate;
	private Time startingTime;
	private Time endTime;
	private Pokemon homePlayer, visitorPlayer;
	
	/**
	 * default constructor
	 */
	public GameDate()
	{
		homePlayer = new Pokemon();
		visitorPlayer = new Pokemon("Charizard", 10);
		gDate = new Date(1,1,2016);
		startingTime = new Time(12, 00 ,00);
		endTime = new Time(12, 30, 00);
	}
	
	/**
	 * overloaded constructor
	 * @param home
	 * @param visitor
	 * @param d
	 * @param startTime
	 * @param eT
	 */
	public GameDate(Pokemon home, Pokemon visitor, Date d, Time startTime, Time eT)
	{
		homePlayer = home;
		visitorPlayer = visitor;
		gDate = d;
		if(!(timeValidation(startTime, eT))){
			startingTime = startTime;
			endTime = eT;}
		else{
			startingTime = new Time(0,0,0);
			endTime = new Time(0,0,0);}
	}
	
	/**
	 * set date
	 * @param gD
	 */
	public void setgDate(Date gD)
	{
		gDate = gD;
	}
	
	/**
	 * get date
	 * @return
	 */
	public Date getgDate()
	{
		return gDate;
	}
	
	/**
	 * set starting time
	 * @param sT
	 */
	public void setStartingTime(Time sT)
	{
		this.startingTime = sT;
	}
	
	/**
	 * get starting time
	 * @return
	 */
	public Time getStartingTime()
	{
		return startingTime;
	}
	
	/**
	 * set end time
	 * @param eT
	 */
	public void setEndTime(Time eT)
	{
		this.endTime = eT;
	}
	
	/**
	 * get end time
	 * @return
	 */
	public Time getEndTime()
	{
		return endTime;
	}
	
	/**
	 * set home pokemon
	 * @param p
	 */
	public void setHomePokemon(Pokemon p)
	{
		this.homePlayer = p;
	}
	
	/**
	 * get home pokemon
	 * @return
	 */
	public Pokemon getHomePokemon()
	{
		return homePlayer;
	}
	
	/**
	 * set visitor pokemon
	 * @param pv
	 */
	public void setVisitorPokemon(Pokemon pv)
	{ 
		this.visitorPlayer = pv;
	}
	
	/**
	 * get visitor pokemon
	 * @return
	 */
	public Pokemon getVisitorPokemon()
	{
		return visitorPlayer;
	}
	
	/**
	 * validate end and start time, return boolean
	 * @param sT
	 * @param eT
	 * @return
	 */
	private boolean timeValidation(Time sT, Time eT)
	{
		boolean flag;
		if((eT.getHours() >= sT.getHours()) && (eT.getMinutes() >= sT.getMinutes()) && (eT.getSeconds() >= sT.getSeconds()))
		{
			if(eT.toString().equals(sT.toString())){
				flag = true;
				System.out.println("Start and End Time are the same. Times reset.");
			}	
			flag = false;
		}
		else{
			System.out.println("Invalid Start and End Times. Times reset.");
			flag = true;}
		return flag;
	}
	
	/**
	 * return string of description
	 */
	public String toString()
	{
		return "Date: " + gDate.toString() 
				+ "\nStart Time: " + startingTime.toString()
				+ "\nEnd Time: " + endTime.toString();
	}
	
	/**
	 * find length from start to end time
	 * @return
	 */
	public Time getLength()
	{
		Time gameLength;
		gameLength = new Time(endTime.getHours() - startingTime.getHours(), endTime.getMinutes() - startingTime.getMinutes(), 
							      endTime.getSeconds() - startingTime.getSeconds());
		return gameLength;
	}

}
