
public class evolutionTester 
{

	/**
	 * Tester for the pokemon classes
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//object 1
		Pokemon Home = new Pokemon();
		//object 2
		Pokemon Visitor = new Pokemon("Bulbasaur", 2);
		
		//new object created using object 1 and 2
		PokEvolve Evolution = new PokEvolve(Home, Visitor);
		
		System.out.println("Home: " + Home.toString() +
						   "\nVisitor: " + Visitor.toString() +
						   "\nEVOLUTION: " + Evolution.toString());

	}

}
