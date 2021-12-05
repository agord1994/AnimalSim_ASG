


public class BrownBear extends Animal implements Walkable,Swimmable {


	private String subSpecies;

	
	
	public BrownBear() {
		super();
		subSpecies=  "Alaskan";
	}//end Argument Constructor



	public BrownBear(int simID,Location l,String subSpecies) {
		super(simID,l);
		
		switch(subSpecies){
		case "Alaskan" : this.subSpecies="Alaskan";
		break;
		case "Asiatic" : this.subSpecies="Asiatic";
		break;
		case "European" : this.subSpecies="European";
		break;
		case "Grizzly" : this.subSpecies="Grizzly";
		break;
		case "Kodiak" : this.subSpecies="Kodiak";
		break;
		case "Siberian" : this.subSpecies="Siberian";
		break;
		default:
			throw new InvalidSubspeciesException(subSpecies+" is not a valid sub species of a brown bear");
		}//end switch block
		
	}//end preferred constructor


	
	//getters and setters for BrownBear class

	public String getSubSpecies() {
		return subSpecies;
	}



	public void setSubSpecies(String subSpecies) {
		
		switch(subSpecies){
		case "Alaskan" : this.subSpecies="Alaskan";
		break;
		case "Asiatic" : this.subSpecies="Asiatic";
		break;
		case "European" : this.subSpecies="European";
		break;
		case "Grizzly" : this.subSpecies="Grizzly";
		break;
		case "Kodiak" : this.subSpecies="Kodiak";
		break;
		case "Siberian" : this.subSpecies="Siberian";
		break;
		default:
			throw new InvalidSubspeciesException(subSpecies+" is not a valid sub species of a brown bear");
		}//end switch block
		
	}//end setSubSpecies



	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", SimID=" + SimID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString method



	@Override
	public void walk(int direction) {
		
		Location currentLocation= super.getLocation();
		String directionOutOfBounds;
		
		switch(direction) {
		
		case 1: currentLocation.update(currentLocation.getxCoord(),currentLocation.getyCoord()+3 );
		break;
		
		case 2: currentLocation.update(currentLocation.getxCoord()+3,currentLocation.getyCoord() );
		break;
	
		case 3: currentLocation.update(currentLocation.getxCoord(),currentLocation.getyCoord()-3 );
		break;
		
		case 4: currentLocation.update(currentLocation.getxCoord()-3,currentLocation.getyCoord() );
		break;
		
		default: directionOutOfBounds= "you muct pass numbers 1 through 4 to pick a direction to walk";
		break;
		}//end switch block
	}//end walk method



	@Override
	public void swim(int direction) {
		// TODO Auto-generated method stub
		Location currentLocation= super.getLocation();
		String directionOutOfBounds;
		
		switch(direction) {
		
		case 1: currentLocation.update(currentLocation.getxCoord(),currentLocation.getyCoord()+2 );
		break;
		
		case 2: currentLocation.update(currentLocation.getxCoord()+2,currentLocation.getyCoord() );
		break;
	
		case 3: currentLocation.update(currentLocation.getxCoord(),currentLocation.getyCoord()-2 );
		break;
		
		case 4: currentLocation.update(currentLocation.getxCoord()-2,currentLocation.getyCoord() );
		break;
		
		default: directionOutOfBounds= "you muct pass numbers 1 through 4 to pick a direction to walk";
		break;
		}//end switch block
	}
		
	
	
	
	
}//end of class

