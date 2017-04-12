package ozlympics;
/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */
/**
 * 
 * Abstract class for the Participants
 *
 */
public abstract class Athletes {
	private int athleteID;
	private String firstName;
	private String lastName;
	private int age;
	private String state;
	//private String sportID;

	public Athletes(int athleteID, String firstName, String lastName, int age, String state) {
	this.athleteID = athleteID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.state = state;
}

public int getAthleteID() {
		return athleteID;
	}


	public void setAthleteID(int athleteID) {
		this.athleteID = athleteID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

public abstract void compete();
}
