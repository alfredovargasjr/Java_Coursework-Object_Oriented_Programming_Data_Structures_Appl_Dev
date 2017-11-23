import java.util.*;
import java.util.Random;
public class Tester {
/**
 * 
 * @param args
 */
	public static void main(String[] args) 
	{
		Pokemon[] Players = new Pokemon[100];
		Players[0] = new Pokemon("Bulbasaur", 001);
		Players[1] = new Pokemon("Charmander", 004);
		Players[2] = new Pokemon("Squirtle", 007);
		Players[3] = new Pokemon("Ivysaur", 002);
		Players[4] = new Pokemon("Venusaur", 003);
		for(int i = 0; i < Pokemon.getN(); i++)
		{
			Players[i].gamesPlayed();
			Players[i].scoresArray(randomScore(100, 50), 1);
			
		}
		boolean flag = false;
		int totalgames = 0;
		do{
			Play(Players);
			if(totalgames > 5)
			{
				boolean flag1;
				do{
				flag1 = true;
				System.out.println("\nContinue? Y / N");
				Scanner scan = new Scanner(System.in);
				String choice = scan.next();
				if(choice.equals("Y") || choice.equals("y")){
					flag = false; 
					continue;}
				if(choice.equals("N") || choice.equals("n")){
					flag = true; 
					continue;}
				else{
					System.out.println("Invalid Entry.");
					flag1 = false;
				}
				}while(!flag1);
			}
			totalgames++;
		}while(!flag);
		info(Players);
	}
	
	/**
	 * 
	 * @param Players
	 */
	public static void Play(Pokemon[] Players)
	{
		int ran1 = randomScore(Pokemon.getN(), 0);
		int ran2 = 0;
		do{
		for(int k = 0; k < 1000; k++){
			ran2 = randomScore(Pokemon.getN(), 0);}
		}while(ran1 == ran2);

		System.out.println("\nBattling");
		System.out.format(" " + "%-10s%5d%5d%8.2f%-100s", Players[ran1].getName(), Players[ran1].getNumber(), Players[ran1].getGamesPlayed(), Players[ran1].getGameAve(), Players[ran1].getScoresArrayString());//+ Players[ran1].getName() + " " + Players[ran1].getNumber() + " " + Players[ran1].getGameAve() + " " + Players[ran1].getGamesPlayed()
			                        //+ "\n " + Players[ran2].getName() + " " + Players[ran2].getNumber() + " " + Players[ran2].getGameAve() + " " + Players[ran2].getGamesPlayed());
		System.out.format("\n " + "%-10s%5d%5d%8.2f%-100s", Players[ran2].getName(), Players[ran2].getNumber(), Players[ran2].getGamesPlayed(), Players[ran2].getGameAve(), Players[ran2].getScoresArrayString());
		PokEvolve gm = new PokEvolve(Players[ran1], Players[ran2]);
		Players[Pokemon.getN()-1] = gm.getNewPokemon();
		System.out.println("\n Result: " + gm.getNewPokemon().getName() + " " + gm.getNewPokemon().getNumber());
		System.out.format("\n " + "%-10s%5d%5d%8.2f%-100s", gm.getHPlayer().getName(), gm.getHPlayer().getNumber(), gm.getHPlayer().getGamesPlayed(), gm.getHPlayer().getGameAve(), gm.getHPlayer().getScoresArrayString());
		System.out.format("\n " + "%-10s%5d%5d%8.2f%-100s", gm.getVPlayer().getName(), gm.getVPlayer().getNumber(), gm.getVPlayer().getGamesPlayed(), gm.getVPlayer().getGameAve(), gm.getVPlayer().getScoresArrayString() + "\n");
	}
	
	public static void info(Pokemon[] players)
	{
		System.out.format("\n"+"%-4s%-13s%-8s%-8s%-8s%-8s", " ", "Name", "Number", "Games", "Average", "Scores");
		for(int i = 0; i < Pokemon.getN(); i++){
			System.out.format("\n"+"%-4d%-13s%-8d%-8d%-8.2f%-8s",i + 1, players[i].getName(), players[i].getNumber(), players[i].getGamesPlayed(), players[i].getGameAve(), players[i].scoreArrayAverageString());
		}
		
		//do{
		//boolean flag = false;
		System.out.println("\nPrint Results: "
						 + "\n[1] Ascending Order " + "\n[2] Ave Order" );
		Scanner scan = new Scanner(System.in);
//		int choice = 1;
//		boolean flag;
//		do{
//			flag = false;
//		try{
//		choice = scan.nextInt();
//		}catch(Exception e){
//			System.out.println("Invalid choice.");
//			flag = true;
//			}
//		}while(flag);
		int choice = scan.nextInt();
		switch(choice){
		case 1:
			Pokemon[] temp = new Pokemon[100];
			temp = Pokemon.NameOrder(players);
			for(int i = 0; i < Pokemon.getN(); i++){
				System.out.format("\n"+"%-4d%-10s%5d%5d%8.2f",i + 1, temp[i].getName(), temp[i].getNumber(), temp[i].getGamesPlayed(), temp[i].getGameAve());	
			}
			break;
		case 2:
			temp = Pokemon.AvgOrder(players);
			for(int i = 0; i < Pokemon.getN(); i++){
				System.out.format("\n"+"%-4d%-10s%5d%5d%8.2f",i + 1, temp[i].getName(), temp[i].getNumber(), temp[i].getGamesPlayed(), temp[i].getGameAve());	
			}
			break;
		default:
			System.out.println("Invalid Option.");
			info(players);
			break;
		}
		//}while(flag);
	}
	
	public static int randomScore(int max, int min)
	{
		Random ran = new Random(System.currentTimeMillis());
		ran = new Random();
		int num = Math.abs(min + ran.nextInt(max - min));
		return num;
	}
	
//	public int inputvalidation(String n)
//	{
//		Scanner scan = new Scanner(System.in);
//		
//	}

}
