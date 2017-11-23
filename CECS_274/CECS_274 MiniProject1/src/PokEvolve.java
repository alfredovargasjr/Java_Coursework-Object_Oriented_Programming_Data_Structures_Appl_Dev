
public class PokEvolve 
{
	/**
	 * Private data
	 */
	private Pokemon homePlayer;
	private Pokemon visitorPlayer;
	
	/**
	 * Default constructor of object
	 */
	public PokEvolve()
	{
		homePlayer = new Pokemon();
		visitorPlayer = new Pokemon();
	}
	
	/**
	 * Override constructor with passed values
	 * @param h
	 * @param v
	 */
	public PokEvolve(Pokemon h, Pokemon v)
	{
		this.homePlayer = h;
		this.visitorPlayer = v;
	}
	
	/**
	 * set homelpayer object as P
	 * @param P
	 */
	public void setHPlayer(Pokemon P)
	{
		this.homePlayer = P;
	}
	
	/**
	 * set visitorplater object as v
	 * @param V
	 */
	public void setVPlayer(Pokemon V)
	{
		this.visitorPlayer = V;
	}
	
	/**
	 * return the homeplayer object
	 * @return
	 */
	public Pokemon getHPlayer()
	{
		return homePlayer;
	}
	
	/**
	 * return the visitorplayer object
	 * @return
	 */
	public Pokemon getVPlayer()
	{
		return visitorPlayer;
	}
	
	/**
	 * return new name of object
	 * @return
	 */
	public Pokemon getPokeName()
	{
		String home = homePlayer.getName();
		String visitor = visitorPlayer.getName();
		int pokenum = getPokeNum(homePlayer, visitorPlayer);
		String evoName = home.substring(0,3) + visitor.substring((visitor.length() - 3),visitor.length());
		return new Pokemon(evoName, pokenum);
	}
	
	public Pokemon winner(Pokemon h, Pokemon v)
	{
		int hashH = h.getName().hashCode();
		int hashV = v.getName().hashCode();
//		if(hashH - h.get)
//	}
//	
	/**
	 * return new pokenum
	 * @return
	 */
	private int getPokeNum(Pokemon h, Pokemon v)
	{
		return h.getNumber() * v.getNumber();
	}
	
	/**
	 * reutnr pokenam and pokenum of object
	 */
	public String toString()
	{
		return "\n  Name: " + getPokeName().getName() +
			   "\n  Number: " + getPokeName().getNumber();
	}

}
