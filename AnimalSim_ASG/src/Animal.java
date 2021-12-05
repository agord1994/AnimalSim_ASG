import java.util.Arrays;
import java.util.Random;

public abstract class Animal extends Location{

	
	protected int SimID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	
	
	public Animal()  {
	
	location=new Location(0,0);
	SimID = 0;
	this.full = false;
	this.rested = true;
		
		
	}//end  Animal Empty Constructor


	public Animal(int SimID,Location l) throws InvalidSimIDException {
	
	if(SimID<=0) {//if SimID is less than or equal to zero
			
			throw new InvalidSimIDException("Coordinates cannot be less than zero");
			}//end if conditional
			else {
				this.location=l;
				this.SimID=SimID;
				this.full = false;
				this.rested = true;
			}//end else
	
	}//end Animal preferred  constructor
	
	
	
	
	public boolean eat() {
		
		
		
		double rand=Math.random();
		
		if (rand<=.5) {
			return this.full=false;
				
		}//end if statement
		
		else {
			return this.full=true;
		}//end else statement
		
	}//end eat method
	
	
	public boolean sleep() {
		

		double rand=Math.random();
		
		if (rand<=.5) {
			return this.rested=false;
				
		}//end if statement
		
		else {
			return this.rested=true;
		}//end else statement
		
	}//end sleep method


	
	//getters and Setters
	
	public int getSimID() {
		return SimID;
	}


	public void setSimID(int simID) {
	if(simID<=0) {//if SimID is less than or equal to zero
			
			throw new InvalidSimIDException("SimID must be greater than zero");
			}//end if conditional
			else {
				SimID = simID;
			}//end else
	
	}//end setSimID


	public Location getLocation() {
		return location;
	}


	public  void setLocation(Location location) {
		this.location = location;
	}


	public boolean isFull() {
		return full;
	}


	public void setFull(boolean full) {
		this.full = full;
	}


	public boolean isRested() {
		return rested;
	}


	public void setRested(boolean rested) {
		this.rested = rested;
	}




	


	
	
}//end of class
