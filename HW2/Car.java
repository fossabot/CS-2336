/*PROBLEM2 IMPLEMENTATION OF CAR CLASS
**USE Problem_2.java TO COMPILE**
*/
	public class Car{
	    String carName;
	    float carHandlingS;
	    float carHandlingC;
	    float carHandlingU;
	    float carRaceProgress;
	    float carCurrentSpeed;
	    float carTopSpeed;
	    float carAcceleration;
	    int carWins = 0;
	    char carSymbol;
	    
	    //Constructor
	    public Car(String name, float handlingS, float handlingC,
	    float handlingU, float raceProgress, float currentSpeed,
	    float topSpeed, float acceleration, char symbol) {
	    		carName = name;
	    		carHandlingS = handlingS;
	    		carHandlingC = handlingC;
	    		carHandlingU = handlingU;
	    		carRaceProgress = raceProgress;
	    		carCurrentSpeed = currentSpeed;
	    		carTopSpeed = topSpeed;
	    		carAcceleration = acceleration;
	    		carSymbol = symbol;
	    }
	    
	    //Getters and setters
	    public void setName(String name) {
	    		carName = name;
	    }
	    public String getName() {
	    		return carName;
	    }
	    public void setCarHandlingS(float handlingS) {
    			carHandlingS = handlingS;
	    }
	    public float getCarHandlingS() {
    			return carHandlingS;
	    }
	    public void setCarHandlingC(float handlingC) {
	    		carHandlingC = handlingC;
	    }
	    public float getCarHandlingC() {
	    		return carHandlingC;
	    }
	    public void setCarHandlingU(float handlingU) {
    			carHandlingU = handlingU;
	    }
	    public float getCarHandlingU() {
    			return carHandlingU;
	    }
	    public void setCarRaceProgress(float raceProgress) {
			carRaceProgress = raceProgress;
	    }
	    public float getCarRaceProgress() {
			return carRaceProgress;
    		}
	    public void setCarCurrentSpeed(float currentSpeed) {
	    		carCurrentSpeed = currentSpeed;
	    }
	    public float getCarCurrentSpeed() {
	    		return carCurrentSpeed;
	    }
	    public void setCarTopSpeed(float topSpeed) {
	    		carTopSpeed = topSpeed;
	    }
	    public float getCarTopSpeed() {
	    		return carTopSpeed;
	    }
	    public void setCarAcceleration(float acceleration) {
	    		carAcceleration = acceleration;
	    }
	    public float getCarAcceleration() {
	    		return carAcceleration;
	    }
	    public void setCarWins(int wins) {
	    		carWins = wins;
	    } 
	    public int getCarWins() {
	    		return carWins; 
	    }
	    public void setCarSymbol(char symbol) {
	    		carSymbol = symbol;
	    }
	    public char getCarSymbol() {
    			return carSymbol; 
	    }
	}
