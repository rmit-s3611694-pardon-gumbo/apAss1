package ozlympics;

import java.util.Random;

/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */

public class Cyclists extends Athletes{
					
		public Cyclists(int athleteID, String firstName, String lastName, int age, String state) {
		super(athleteID, firstName, lastName, age, state);
		}	
		public void  compete() {
			for (int i = 0; i <= 8; i++){
				Random random = new Random();
				int Low = 500;
				int High = 800;
				Integer result = random.nextInt(High - Low + 1) + Low;
				//To be continued...
				
			}
		}
}	
