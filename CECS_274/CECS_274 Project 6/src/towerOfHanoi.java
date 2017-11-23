import java.util.*;
import java.util.ArrayList;

public class towerOfHanoi 
{
	private  Pokemon[] pokemon;
	private ArrayList<Pokemon> A = new ArrayList<>();
	private ArrayList<Pokemon> B = new ArrayList<>();
	private ArrayList<Pokemon> C = new ArrayList<>();
	
	public towerOfHanoi()
	{
		pokemon = new Pokemon[3];
		pokemon[0] = new Pokemon("Bulbasaur");
		pokemon[1] = new Pokemon("Charmander");
		pokemon[2] = new Pokemon();

		for(int i = 0; i < pokemon.length; i++)
		{
			A.add(pokemon[i]);
		}
	}
	
	public void solve(int n, ArrayList<Pokemon> start, ArrayList<Pokemon> auxiliary, ArrayList<Pokemon> end) {
		showLists(start, end, auxiliary);
		if (n == 1) {
			end.add(0, start.get(0));
			start.remove(0);
			showLists(start, end, auxiliary);
		} else {
			solve(n - 1, start, end, auxiliary);
			end.add(0, start.get(0));
			start.remove(0);
			showLists(start, end, auxiliary);
			solve(n - 1, auxiliary, start, end);
		}
		A = start;
		B = auxiliary;
		C = end;
	}
	
//	public towerOfHanoi(Pokemon p, String start, String mid, String end)
//	{
//		for(int i = 0; i < pokemon.length; i++){
//			A.add(pokemon[i]);
//			}
//	}
	
	public void showLists(ArrayList<Pokemon> s, ArrayList<Pokemon> a, ArrayList<Pokemon> e) throws IndexOutOfBoundsException
	{
		Pokemon[] p1 = new Pokemon[3];
		Pokemon[] p2 = new Pokemon[3];
		Pokemon[] p3 = new Pokemon[3];
		for(int i = 0; i < 3; i++)
		{
			p1[i] = new Pokemon(" ");
			p2[i] = new Pokemon(" ");
			p3[i] = new Pokemon(" ");
			
		}
		for(int i = 0; i < s.size(); i++)
		{
			p1[i] = s.get(i);
		}
		for(int i = 0; i < a.size(); i++)
		{
			p2[i] = a.get(i);
		}
		for(int i = 0; i < e.size(); i++)
		{
			p3[i] = e.get(i);
		}
		System.out.format("\n" + "%13s%13s%13s", "A", "B", "C");
		for(int i = 0; i < 3; i++){
		System.out.format("\n" + "%13s%13s%13s", p1[i], p2[i], p3[i], "\n");
		}
	}
	
	public ArrayList getListA()
	{
		return A;
	}
	
	public ArrayList getListB()
	{
		return B;
	}
	
	public ArrayList getListC()
	{
		return C;
	}

	
	
	

}
