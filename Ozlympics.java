package ozlympics;
/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */
/**
 * 
 * Main Class
 *
 */
public class Ozlympics {

		public static void main(String[] args) {
			/**
			 * Data tables for athletes				
			 */
			Swimmers swimmer[] = new Swimmers[5];
			swimmer[0] =  new Swimmers(01, "George", "Martin", 21, "Vic");
			swimmer[1] =  new Swimmers(02, "Rob", "Stoney", 19, "Vic");
			swimmer[2] =  new Swimmers(03, "John", "Michael", 17, "SWA");
			swimmer[3] =  new Swimmers(04, "Jim", "Hendriks", 21, "SA");
			swimmer[4] =  new Swimmers(07, "Mark", "van Zil", 33, "NA");
			
			
			Cyclists cyclist[]  = new Cyclists[4];
			cyclist[0] =  new Cyclists(12, "Tom", "Martin", 23, "WA");
			cyclist[1] =  new Cyclists(21, "Tim", "Templar", 22, "NWA");
			cyclist[2] =  new Cyclists(32, "Simon", "West", 25, "Vic");
			cyclist[3] =  new Cyclists(47, "Titus", "North", 18, "NSW");
			
			Sprinters runner[] = new Sprinters[6];
			runner[0] =   new Sprinters(52, "Tom", "Jones", 22, "Vic");
			runner[1] =   new Sprinters(57, "Mick", "Jagger", 20, "NT");
			runner[2] =   new Sprinters(60, "Rick", "Martin", 22, "Vic");
			runner[3] =   new Sprinters(71, "John", "Lennon", 20, "NT");
			runner[4] =   new Sprinters(82, "David", "Bowie", 22, "Vic");
			runner[5] =   new Sprinters(87, "Ringo", "Starr", 20, "WA");
			
			Driver driver = new Driver();
			driver.userChoice();
		}
	}

