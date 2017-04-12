package ozlympics;

import java.util.Scanner;
/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */

public class Games {
	private String sportType;
	private int gameNo;
	
public Games(){};

public Games(int gameNo, String sportType) {
		super();
		this.sportType = sportType;
		this.gameNo = gameNo;
	}

public String getSportType() {
	return sportType;
}

public void setSportType(String sportType) {
	this.sportType = sportType;
}

public int getGameNo() {
	return gameNo;
}

public void setGameNo(int gameNo) {
	this.gameNo = gameNo;
}

public void selectGame() {

	System.out.println("Now in games class ...");
	System.out.println(" ================================== ");
	System.out.println("|        SPORT  SELECTION          |");
	System.out.println("|==================================|");
	System.out.println("| 1.Swimming                       |");
	System.out.println("| 2.Cycling                        |");
	System.out.println("| 3.Running                        |");
	System.out.println("| 0.Exit                           |");
	System.out.println(" ================================== ");
	
	Scanner input =  new Scanner(System.in);
	
	System.out.println("");
	int choice = input.nextInt();
	if (choice < 1 || choice > 3) {
		System.out.println("Please Enter valid choice...");
		choice = input.nextInt();	
		}
	else
	if (choice == 1){
    	setSportType("Swimming");
    }
    else if (choice == 2){
    	setSportType("Cycling");
    }
    else if (choice == 3){
    	setSportType("Running");
    }
	Scanner screen = new Scanner(System.in);
	int gameID = screen.nextInt();
	this.setGameNo(gameID);
	System.out.println("Choice is  " +  getSportType() + "   Game no:  " +getGameNo());
	}
}
