import java.util.Scanner;
import java.util.Random;

public class pokemonTester {

	/**
	 * 	//calls to pokemon method
	 * @param args
	 */	
	public static void main(String[] args)
	{
		Pokemon();
	}
	
	/**
	 * 	//construct object in pokemon.class
	 */
	public static void Pokemon()
	{
		Pokemon pokemon1 = new Pokemon("Bulbasaur", 001, "Grass Poison", "Male", 15.2, 2.04, 3);
		Pokemon pokemon2 = new Pokemon("Ivysaur", 002, "Grass Poison", "Male", 28.7, 3.03, 25);
		Pokemon pokemon3 = new Pokemon("Venusaur", 003, "Grass Poison", "Male", 220.5, 6.07, 40);
		Pokemon pokemon4 = new Pokemon("Charmander", 004, "Fire", "Female", 18.7, 2.0, 1);
		Pokemon pokemon5 = new Pokemon("Charmeleon", 005, "Fire", "Female", 41.9, 3.07, 18);
		Play(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5);
	}
	
	/**
	 * calls pokemon info DISPLAY
	 * pokedex calls method that displays obejcts (Pokemon)
	 * calls choosepokemon method
	 * method runs till an object (Pokemon) reaches score = 100
	 * @param pokemon1
	 * @param pokemon2
	 * @param pokemon3
	 * @param pokemon4
	 * @param pokemon5
	 */
	public static void Play(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4,Pokemon pokemon5)
	{
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do{
		pokemonInfo(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5);
		pokedex(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5);
		choosePokemon(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5);
		if(pokemon1.getScore() >= 100 || pokemon2.getScore() >= 100 || pokemon3.getScore() >= 100 || pokemon4.getScore() >= 100
				|| pokemon5.getScore() >= 100)
		{
			flag = false;
		}
		System.out.println("Press Enter to continue");
		String cont = scan.nextLine();
		
		}while(flag);
	}
	
	/**
	 * Display objects and their attributes 
	 * @param pokemon1
	 * @param pokemon2
	 * @param pokemon3
	 * @param pokemon4
	 * @param pokemon5
	 */
	public static void pokedex(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4,Pokemon pokemon5)
	{
		System.out.println("\nPokemon 1: " + pokemon1.getName()
						 + "\nPokemon 2: " + pokemon2.getName()
						 + "\nPokemon 3: " + pokemon3.getName()
						 + "\nPokemon 4: " + pokemon4.getName()
						 + "\nPokemon 5: " + pokemon5.getName());
	}
	
	/**
	 * prompts user to choose object (pokemon)
	 * inputvalidation
	 * calls choice to battle method
	 * @param pokemon1
	 * @param pokemon2
	 * @param pokemon3
	 * @param pokemon4
	 * @param pokemon5
	 */
	public static void choosePokemon(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4,Pokemon pokemon5)
	{
		System.out.println("Choose a Pokemon: ");
		boolean flag;
		do{
		flag = false;
		int choice = inputValidation();
		switch(choice){
		case 1: 
			Battle1(pokemon1);
			break;
		case 2:
			Battle1(pokemon2);
			break;
		case 3:
			Battle1(pokemon3);
			break;
		case 4:
			Battle1(pokemon4);
			break;
		case 5:
			Battle1(pokemon5);
			break;
		default:
			System.out.println("Invalid Entry.");
			flag = true;
		}
		}while(flag);
	}
	
	/**
	 * random value from 1-2 to decide if battle won or lose
	 * if won, add score of 3
	 * if lose, add score of 1
	 * @param character
	 */
	public static void Battle1(Pokemon character)
	{
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int winlose = ran.nextInt(2) + 1;
		System.out.println("Battling... \nPress Enter to Continue.");
		String space = scan.nextLine();
		if(winlose == 1)
		{
			System.out.println("Battle Lost.");
			character.addScore(1);
			character.setTotalScore(1);
			character.setGamesPlayed();
		}
		else
		{
			System.out.println("Battle Won.");
			character.addScore(3);
			character.setTotalScore(3);
			character.setGamesPlayed();
		}
	}
	
	/**
	 * Display attributes of objects
	 * input validation
	 * @param pokemon1
	 * @param pokemon2
	 * @param pokemon3
	 * @param pokemon4
	 * @param pokemon5
	 */
	public static void pokemonInfo(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4,Pokemon pokemon5)
	{
		System.out.println("Enter Pokemon to view info (1 - 5)");
		boolean flag;
		do{
		int choice = inputValidation();
		flag = false;
		if(choice == 1){
			System.out.println("Name: " + pokemon1.getName() + " " + pokemon1.getNationalNum()
			 + "\nType: " + pokemon1.getType()
			 + "\nGender: " + pokemon1.getGender()
			 + "\nHeight: " + pokemon1.getHeight()
			 + "\nWeight: " + pokemon1.getWeight()
			 + "\nScore: " + pokemon1.getScore()
			 +"\nGames Played: " + pokemon1.gamesPlayed()
			 +"\nTotal Score Gained: " + pokemon1.getTotalScore()
			 +"\nAverage Score: " + pokemon1.getScoreAverage());
			break;
		}
		if(choice == 2){
			System.out.println("Name: " + pokemon2.getName() + " " + pokemon2.getNationalNum()
			 + "\nType: " + pokemon2.getType()
			 + "\nGender: " + pokemon2.getGender()
			 + "\nHeight: " + pokemon2.getHeight()
			 + "\nWeight: " + pokemon2.getWeight()
			 + "\nScore: " + pokemon2.getScore()
			 + "\nGames Played: " + pokemon2.gamesPlayed()
			 +"\nTotal Score Gained: " + pokemon2.getTotalScore()
			 +"\nAverage Score: " + pokemon2.getScoreAverage());
			break;
		}
		if(choice == 3 ){
			System.out.println("Name: " + pokemon3.getName() + " " + pokemon3.getNationalNum()
			 + "\nType: " + pokemon3.getType()
			 + "\nGender: " + pokemon3.getGender()
			 + "\nHeight: " + pokemon3.getHeight()
			 + "\nWeight: " + pokemon3.getWeight()
			 + "\nScore: " + pokemon3.getScore()
			 + "\nGames Played: " + pokemon3.gamesPlayed()
			 +"\nTotal Score Gained: " + pokemon3.getTotalScore()
			 +"\nAverage Score: " + pokemon3.getScoreAverage());
			break;
		}
		if(choice == 4){
			System.out.println("Name: " + pokemon4.getName() + " " + pokemon4.getNationalNum()
			 + "\nType: " + pokemon4.getType()
			 + "\nGender: " + pokemon4.getGender()
			 + "\nHeight: " + pokemon4.getHeight()
			 + "\nWeight: " + pokemon4.getWeight()
			 + "\nScore: " + pokemon4.getScore()
			 + "\nGames Played: " + pokemon4.gamesPlayed()
			 +"\nTotal Score Gained: " + pokemon4.getTotalScore()
			 +"\nAverage Score: " + pokemon4.getScoreAverage());
			break;
		}
		if(choice == 5){
			System.out.println("Name: " + pokemon5.getName() + " " + pokemon5.getNationalNum()
			 + "\nType: " + pokemon5.getType()
			 + "\nGender: " + pokemon5.getGender()
			 + "\nHeight: " + pokemon5.getHeight()
			 + "\nWeight: " + pokemon5.getWeight()
			 + "\nGames Played: " + pokemon5.gamesPlayed()
			 +"\nTotal Score Gained: " + pokemon5.getTotalScore()
			 +"\nAverage Score: " + pokemon5.getScoreAverage());
			break;
		}
		else
		{
			System.out.println("Invalid Entry.");
			flag = true;
		}
		}while(flag);
		Scanner scan = new Scanner(System.in);
		System.out.print("\nPress Enter to Continue.");
		String cont = scan.nextLine();
	}
	
	/**
	 * called from method to validate input, if input contains all integers
	 * @return input value
	 */
	public static int inputValidation()
	{
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		String uinput;
		do{
			flag = false;
			uinput = scan.nextLine();
			char[] test = uinput.toCharArray();
			for(int i = 0; i < test.length; i++)
			{
				char a = test[i];
				if(!(Character.isDigit(a)))
				{
					flag = true;
					System.out.println("Invalid Input.");
					break;
				}
			}
		}while(flag);
		int num = Integer.valueOf(uinput);
		return num;
	}

}
