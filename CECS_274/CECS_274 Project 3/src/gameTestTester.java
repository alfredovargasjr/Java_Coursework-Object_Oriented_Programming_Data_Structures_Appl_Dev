
public class gameTestTester {

	public static void main(String[] args) {
		
		//date(home, away, date, starttime, endtime)
		//default constructor
		GameDate defaultGameDate = new GameDate();
		System.out.println("Date: " + defaultGameDate.getgDate() 
		+ "\nStart Time: " + defaultGameDate.getStartingTime()
		+ "\nEnd Time: " + defaultGameDate.getEndTime()
		+ "\nDuration: " + defaultGameDate.getLength()
		+ "\n\nHome: \n" + defaultGameDate.getHomePokemon().toString() 
		+ "\nVisitor: \n" + defaultGameDate.getVisitorPokemon().toString());
		
		//overloaded constructor
		GameDate overloadedGameDate = new GameDate(new Pokemon(), new Pokemon("Charizard", 10), new Date(), new Time(12, 0, 0), new Time(12, 0, 11));
		//set start time for default constructor
		defaultGameDate.setStartingTime(new Time(3,0,0));
		//set end time for default constructor
		defaultGameDate.setEndTime(new Time(26,0,0));
		
		System.out.println("Date: " + overloadedGameDate.getgDate() 
							+ "\nStart Time: " + overloadedGameDate.getStartingTime()
							+ "\nEnd Time: " + overloadedGameDate.getEndTime()
							+ "\nDuration: " + overloadedGameDate.getLength()
							+ "\n\nHome: \n" + overloadedGameDate.getHomePokemon().toString() 
							+ "\nVisitor: \n" + overloadedGameDate.getVisitorPokemon().toString());
		System.out.println("Date: " + defaultGameDate.getgDate() 
		+ "\nStart Time: " + defaultGameDate.getStartingTime()
		+ "\nEnd Time: " + defaultGameDate.getEndTime()
		+ "\nDuration: " + defaultGameDate.getLength()
		+ "\n\nHome: \n" + defaultGameDate.getHomePokemon().toString() 
		+ "\nVisitor: \n" + defaultGameDate.getVisitorPokemon().toString());
	}
}
