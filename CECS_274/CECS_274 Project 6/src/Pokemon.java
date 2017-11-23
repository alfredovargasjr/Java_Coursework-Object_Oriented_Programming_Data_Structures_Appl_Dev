import java.util.*;
import java.io.*;

public class Pokemon 
{
	private Pokemon[] pokemon;
	private String name;
	
	public Pokemon()
	{
		name = "Pikachu";
	}
	
	public Pokemon(String n)
	{
		name = n;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Pokemon[] sortNameSize(Pokemon[] p)
	{
		Pokemon[] temp = new Pokemon[p.length];
		for(int m = 0; m < p.length; m++)
		{
			temp[m] = p[m];
		}
		for(int i = 0; i < temp.length; i++)
		{
			for(int j = i + 1; j < temp.length; j++)
			{
				if(temp[i].getName().length() > temp[j].getName().length())
				{
					Pokemon t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}
			}
		}
		return temp;
	}
	
	public static Pokemon[] NameOrder(Pokemon[] pokemon, int size)
	{
		Pokemon[] temp = new Pokemon[pokemon.length];
		for(int k = 0; k < pokemon.length; k++)
		{
			temp[k] = pokemon[k];
		}
		for(int i = 0; i < size; i++)
		{
			for(int j = i+1; j < size; j++)
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
	
	public String toString()
	{
		return name;
	}
	
}
