
public class PokEvolve 
{
	/**
	 * Private data
	 */
	private Pokemon homePlayer;
	private Pokemon visitorPlayer;
	private Pokemon newPokemon;
	
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
		battle(h, v);
	}
	
	/**
	 * set homeplayer object as P
	 * @param P
	 */
	public void setHPlayer(Pokemon P)
	{
		this.homePlayer = P;
	}
	
	/**
	 * set visitorplayer object as v
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
	
	//return new pokemon 
	private void battle(Pokemon h, Pokemon v)
	{
		int hashH = h.getName().hashCode();
		int hashV = v.getName().hashCode();
		h.gamesPlayed();
		v.gamesPlayed();
		//winner is v 
		if((hashH - h.getGameAve()) > (hashV - v.getGameAve())){
			newPokemon = pokeName(v, h);
			//num = pokeNum(v.getNumber(), h.getNumber());
			v.scoresArray( gameScoreWinner(Math.abs((int)(hashV - v.getGameAve())) % 100), 1);
			h.scoresArray( gameScoreLoser( Math.abs((int)(hashV - v.getGameAve())) % 100), 0);}
		//winner is h
		else{
			newPokemon = pokeName(h, v);
			//num = pokeNum(h.getNumber(), v.getNumber());
			h.scoresArray( gameScoreWinner(Math.abs((int)(hashH - h.getGameAve())) % 100), 1);
			v.scoresArray( gameScoreLoser( Math.abs((int)(hashH - h.getGameAve())) % 100), 0);}	
	}
	
	/**
	 * return name of new pokemon
	 * @param w
	 * @param l
	 * @return 
	 */
	public Pokemon pokeName(Pokemon w, Pokemon l)
	{
		String evoName = w.getName().substring(0,3) + l.getName().substring((l.getName().length() - 3),l.getName().length());
		int newnum = pokeNum(w.getNumber(), l.getNumber());
		return new Pokemon(evoName, newnum);
	}
	
	/**
	 * 
	 * @return
	 */
	public Pokemon getNewPokemon()
	{
		return newPokemon;
	}
	
	/**
	 * return num of new pokemon 
	 * @param x
	 * @param y
	 * @return
	 */
	private int pokeNum(int x, int y)
	{
		double fract = ((Math.abs(x-y) - 1)*(Math.abs(x-y) - 1)) / 4;
		int trunc = (int) fract;
		return x*y + trunc;
	}
	
	/**
	 * return gamescore
	 * @param w
	 * @param l
	 * @return
	 */
	private int gameScoreWinner(int w)
	{
		if(w < 50){
			return 100 - w;}
		else {
			return w;}
	}
	
	private int gameScoreLoser(int w)
	{
		if(w < 50){
			return w;}
		else{
			return 100 - w;}
	}
	
	/**
	 * reutnr pokenam and pokenum of object
	 */
	public String toString()
	{
		return "\n  Home: " + homePlayer.getName() + "  " + homePlayer +
			   "\n  Visitor: " + visitorPlayer.getNumber();
	}

}
