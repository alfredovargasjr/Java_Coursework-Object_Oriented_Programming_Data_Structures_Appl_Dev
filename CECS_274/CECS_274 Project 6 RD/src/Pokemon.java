
public class Pokemon {
	
	//private data
	private String name;
	
	/**
	 * general constructor 
	 */
	public Pokemon()
	{
		name = "Pikachu";
	}
	
	/**
	 * overloaded constructor 
	 * @param n
	 */
	public Pokemon(String n)
	{
		name = n;
	}
	
	/**
	 * 
	 * @param n
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * 
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * sort by using lexiographical order
	 * @param pokemon
	 * @return
	 */
	public static Pokemon[] NameOrder(Pokemon[] pokemon)
	{
		Pokemon[] temp = new Pokemon[pokemon.length];
		for(int k = 0; k < pokemon.length; k++)
		{
			temp[k] = pokemon[k];
		}
		for(int i = 0; i < temp.length; i++)
		{
			for(int j = i+1; j < temp.length; j++)
			{
				char p1 = temp[i].getName().charAt(0); 
				char p2 = temp[j].getName().charAt(0);
				if(p1 >= p2)
				{
					if(p1 == p2)
					{
						p1 = temp[i].getName().charAt(1);
						p2 = temp[j].getName().charAt(1);
						if(p1 >= p2)
						{
							p1 = temp[i].getName().charAt(2);
							p2 = temp[j].getName().charAt(2);
							if(p1 > p2)
							{
								Pokemon t = temp[i];
								temp[i] = temp[j];
								temp[j] = t;
							}
						}
						else
						{
							Pokemon t = temp[i];
							temp[i] = temp[j];
							temp[j] = t;
						}
					}
					else
					{
						Pokemon t = temp[i];
						temp[i] = temp[j];
						temp[j] = t;
					}
				}	
			}
		}
		return temp;
	}
	
	public String toString()
	{
		return name;
	}

}
