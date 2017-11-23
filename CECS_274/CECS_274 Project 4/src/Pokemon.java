
public class Pokemon 
{
	private String name;
	private int number;
	private int games;
	private double gameAve;
	private int[]gameScore = new int[100];
	private String[]winlose = new String[100];
	private static int n;
	
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
		setN();
		
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
	
	public static void setN()
	{
		n++;
	}
	public static int getN()
	{
		return n;
	}
	
	public void gamesPlayed()
	{ 
		this.games = games + 1;
	}
	
	public int getGamesPlayed()
	{
		return games;
	}
	
	public void setGamesPlayed(int n)
	{
		this.games = n;
	}
	
	/**
	 * get the game average of the pokemon
	 */
	public void gameAvg()
	{
		int sum = 0;
		if(games == 0)
			this.gameAve = 0;
		else{
			for(int i = 0; i < gameScore.length; i++){
			sum = sum + gameScore[i];
			}
			this.gameAve = sum / games;
		}
	}
	
	/**
	 * 
	 * @return gameaverage
	 */
	public double getGameAve()
	{
		gameAvg();
		return gameAve;
	}
	
	/**
	 * set the array of scores
	 * @param s
	 * @param r
	 */
	public void scoresArray(int s, int r)
	{
		gameScore[games - 1] = s; 
		if(r == 1)
			winlose[games - 1] = "*";
		if(r == 0)
			winlose[games - 1] = "^";
	}
	
	/**
	 * get the array 
	 * @return array
	 */
	public int[] getScoresArray()
	{
		return gameScore;
	}
	
	/**
	 * return the string of the score array
	 * @return
	 */
	public String scoreArrayAverageString()
	{
		int[] temp = new int[gameScore.length];
		String[] tempWL = new String[winlose.length];
		for(int i = 0; i < gameScore.length; i++)
		{
			temp[i] = gameScore[i];
			tempWL[i] = winlose[i];
		}
		for(int j = 0; j < games; j++)
		{
			for(int k = j+1; k < games; k++)
			{
				if(temp[j] < temp[k]){
					int t = temp[j];
					String twl = tempWL[j];
					temp[j] = temp[k];
					tempWL[j] = tempWL[k];
					tempWL[k] = twl;
					temp[k] = t;}
			}
		}
		String toString = "";
		for(int i = 0; i < games; i++)
		{
			toString = toString + temp[i] + tempWL[i] + " ";
		}
		return toString;
	}
	
	/**
	 * return the scores array as a string
	 * @return
	 */
	public String getScoresArrayString()
	{
		String toString = "  ";
		for(int i = 0; i < games; i++)
		{
			toString = toString + gameScore[i] + winlose[i] + " ";
		}
		return toString;
	}
	
	/**
	 * returne winlose
	 * @return
	 */
	public String[] getWinLose()
	{
		return winlose;
	}
	
	/**
	 * return the average order of pokemon array
	 * @param players
	 * @return
	 */
	public static Pokemon[] AvgOrder(Pokemon[] players)
	{
		
		Pokemon[] temp = new Pokemon[players.length];
		for(int k = 0; k < players.length; k++)
		{
			temp[k] = players[k];
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				double num = temp[i].gameAve;
				if(num < temp[j].gameAve){
					Pokemon t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}	
			}
		}
		return temp;
	}
	
	/**
	 * return the name order
	 * @param players
	 * @return
	 */
	public static Pokemon[] NameOrder(Pokemon[] players)
	{
		Pokemon[] temp = new Pokemon[players.length];
		for(int k = 0; k < players.length; k++)
		{
			temp[k] = players[k];
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				char p1 = temp[i].getName().charAt(0); 
				char p2 = temp[j].getName().charAt(0);
				if(p1 >= p2){
					if(p1 == p2){
						p1 = temp[i].getName().charAt(1);
						p2 = temp[j].getName().charAt(1);
						if(p1 >= p2){
							Pokemon t = temp[i];
							temp[i] = temp[j];
							temp[j] = t;
						}
					}
					Pokemon t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}	
			}
		}
		return temp;
	}
	
	/**
	 * return highest average
	 * @param players
	 * @return
	 */
	public Pokemon highestAverage(Pokemon[] players)
	{
		return Pokemon.AvgOrder(players)[0];
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
