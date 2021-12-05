import java.util.Arrays;

public class Location {
		private int xCoord;
		private int yCoord;
	
		
		
		
		public Location() {
			
			this.xCoord = 0;
			this.yCoord = 0;
		}//end Location empty Constructor
		
		
		public Location (int x, int y)throws InvalidCoordinateException {
			
			if(x<0 ||y<0) {//if x or y is less than 0 an exception should be called
				
			throw new InvalidCoordinateException("Coordinates cannot be less than zero");
			}//end if conditional
			else {
				this.xCoord=x;
				this.yCoord=y;
			}//end else
		
		}//end preferred Location Constructor
		
		
		public void update(int x,int y)throws InvalidCoordinateException {
			if(x<0 ||y<0) {//if x or y is less than 0 an exception should be called
				
				throw new InvalidCoordinateException("Coordinates cannot be less than zero");
				}//end if conditional
				else {
					this.xCoord=x;
					this.yCoord=y;
				}//end else
		}//end update method
		
		public int[] getCoordinates(){
			
			 int[]   ints2Array = new int[]{ this.xCoord,this.yCoord};
			return  ints2Array;
		}


		



		public int getxCoord() {
			return xCoord;
		}


		public int getyCoord() {
			return yCoord;
		}


		@Override
		public String toString() {
			return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
		}
		
		
	}//end class
