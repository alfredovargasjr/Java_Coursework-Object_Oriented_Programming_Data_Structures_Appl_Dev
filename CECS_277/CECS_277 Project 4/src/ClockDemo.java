
/**
 * Alfredo Vargas
 * CECS 277
 * Project 4: Clock
 * Susan
 * @author Alfredo
 *
 */

public class ClockDemo {

	public static void main(String[] args) {
		//test Clock alone
		 System.out.println("Testing Clock class");
		 Clock clock = new Clock();
		 System.out.println("Hours: " + clock.getHours());
		 System.out.println("Minutes: " + clock.getMinutes());
		 System.out.println("Time: " + clock.getTime());
		
		 //test WorldClock
		 System.out.println("");
		 System.out.println("Testing WorldClock class");
		 int offset = 3;
		 System.out.println("Offset: " + offset);
		 WorldClock wclock = new WorldClock(offset);
		 System.out.println("Hours: " + wclock.getHours());
		 System.out.println("Minutes: " + wclock.getMinutes());
		 System.out.println("Time: " + wclock.getTime());

		//test AlarmClock
		 int h = clock.getHours();
		 int m = clock.getMinutes();

		 clock.setAlarm(h, m - 1);
		 System.out.println("Time: " + clock.getTime());
		 //test to see if the Alarm is cleared.
		 System.out.println("Time: " + clock.getTime());


	}
	
}
