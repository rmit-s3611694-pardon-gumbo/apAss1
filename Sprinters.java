package ozlympics;

import java.util.Random;
/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */

public class Sprinters extends Athletes {
	 String gameNo;
	 String sportType;
	 String athleteID;
	 int pointsThisGame;
	 int cumulativePoints;

public Sprinters(int athleteID, String firstName, String lastName, int age, String state) {
		super(athleteID, firstName, lastName, age, state);
	}

public void compete() {
		Random r = new Random();
		int low = 10;
		int high = 20;
		int result = r.nextInt(high - low + 1) + low;
		//Still under construction		
		//System.out.println(" Random number  =  " + result);	
	}
}
