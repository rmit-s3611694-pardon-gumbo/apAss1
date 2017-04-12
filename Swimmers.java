package ozlympics;

import java.util.HashMap;
import java.util.Random;
/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */

public class Swimmers extends Athletes{

	private int noOfAthletes;
	private int athleteResult;
	
	public Swimmers(int athleteID, String firstName, String lastName, int age, String state) {
		super(athleteID, firstName, lastName, age, state);
	}

	public int getNoOfAthletes() {
		return noOfAthletes;
	}

	public void setNoOfAthletes(int noOfAthletes) {
		this.noOfAthletes = noOfAthletes;
	}

	public int getAthleteResult() {
		return athleteResult;
	}


	public void setAthleteResult(int athleteResult) {
		this.athleteResult = athleteResult;
	}

	public void compete() {
		
		for (int i = 0; i <= getNoOfAthletes(); i++){
			Random random = new Random();
			int low = 100;
			int high = 200;
			athleteResult = random.nextInt(high - low + 1) + low;
			//More code here ...
		}
	}
}
