/**
 * @author Alfredo Vargas
 * CECS 274 
 * Project 2
 */

public class Pokemon 
{
	//private data
	private String name, type, gender;
	private double weight, height, scoreAverage;
	private int nationalNum, score, gamesPlayed = 0, totalScore;
	
	//public data , default
	public Pokemon() //default constructor 
	{
		name = "Charmander";
		nationalNum = 004;
		type = "Fire";
		gender = "Male";
		weight = 18.7;
		height = 2.00;
		gamesPlayed = 0;
		nationalNum = 004;
	}
	/**
	 * 
	 * @param name
	 * @param type
	 * @param gender
	 * @param weight
	 * @param height
	 */
	public Pokemon(String name, int NationalNum, String type, String gender, double weight,
			double height) //constrcutor without score or games played
	{
		this.name = name;
		this.nationalNum = nationalNum;
		this.type = type;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.score = 1;
		this.gamesPlayed = 0;
		
	}
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param gender
	 * @param weight
	 * @param height
	 * @param score
	 */
	public Pokemon(String name, int nationalNum, String type, String gender, double weight,
			double height, int score)	//constructor with score
	{
		this.name = name;
		this.nationalNum = nationalNum;
		this.type = type;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.score = score;
		this.gamesPlayed = 0;
	}
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param gender
	 * @param weight
	 * @param height
	 * @param score
	 * @param gamesPlayed
	 */
	public Pokemon(String name, int nationalNum, String type, String gender, double weight,
			double height, int score, int gamesPlayed) //constructor with score and games played
	{
		this.name = name;
		this.nationalNum = nationalNum;
		this.type = type;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.score = score;
		this.gamesPlayed = gamesPlayed;
	}
	
	//set data values
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * 
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
	 * 
	 * @param gender
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	/**
	 * 
	 * @param weight
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * 
	 * @param height
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	 * 
	 * @param score
	 */
	public void setScore(int score)
	{
		this.score = score;
	}
	
	/**
	 * 
	 */
	public void setGamesPlayed() //increments gamesPlayed by one every set
	{
		this.gamesPlayed = gamesPlayed + 1;
	}
	
	/**
	 * 
	 * @param score
	 */
	public void setTotalScore(int score)
	{
		this.totalScore = totalScore + score;
	}
	
	/**
	 * 
	 */
	public void setScoreAverage()
	{
		this.scoreAverage = totalScore / (gamesPlayed + 1);
	}
	/**
	 * 
	 * @param addScore
	 */
	
	public void setNationalNum()
	{
		this.nationalNum = nationalNum;
	}
	
	public void addScore(int addScore)
	{
		this.score = score + addScore;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getNationalNum()
	{
		return nationalNum;
	}
	public String getType()
	{
		return type;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public String getGender()
	{
		return gender;	
	}
	
	/**
	 * 
	 * @return
	 */
	public double getHeight()
	{
		return height;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public double getWeight()
	{
		return weight;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getScore()
	{
		return score;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotalScore()
	{
		return totalScore;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getScoreAverage()
	{
		double Average;
		if(gamesPlayed == 0)
				return 0;
		else
			Average = (Double.valueOf(totalScore) / Double.valueOf(gamesPlayed));
		
		return Average;
	}

	/**
	 * 
	 * @return
	 */
	public int gamesPlayed()
	{
		return gamesPlayed;
	}

}
