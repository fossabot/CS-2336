/*CS2336 HW2 PROBLEM2 GOETTEN
Car race program 
*/
import java.util.Random;
public class Problem_2 {
	
	public static void main(String[] args) {
		
		int RaceNumber = 25;
		
			//Objective1:	
				//Car objects
				Car car0 = new Car("Bob Barker Car", 0.30f, 0.65f, 0.1f, 0, 0, 0.95f, 0.11f,'B');
				Car car1 = new Car("Pat Sajak Car", 0.45f, 0.85f, 0.3f, 0, 0, 0.78f, 0.08f, 'P');
				Car car2 = new Car("Alex Trebek Car", 0.25f, 0.55f, 0.1f, 0, 0, 0.95f, 0.19f, 'A');
				Car car3 = new Car("Drew Carrie Car", 0.15f, 0.25f, 0.05f, 0, 0, 0.9999f, 0.21f, 'D');
				
				//Array of objects for the cars
				Car list[] = new Car[4];
				list[0] = car0;
				list[1] = car1;
				list[2] = car2; 
				list[3] = car3;
				
			//Objective2:
				//Simulate the race 25 times
				for(int l = 0; l < RaceNumber; l++){
			//Objective3:	
				//Generate race track
				int raceLength = 45;
				char Racetrack[] = new char[raceLength];			
				for(int m = 0; m < raceLength-1; m++){
					Random rand = new Random();
					int num = rand.nextInt(10) + 1;
					if(num >=1 && num <= 7) {
						Racetrack[m] = '-';
					}
					else if(num == 8) {
						Racetrack[m] = 'S';
					}
					else if(num == 9) {
						Racetrack[m] = 'U';
					}
					else if(num == 10) {
						Racetrack[m] = 'C';
					}
				}
				//Rejoins the array into a string
				String track = new String(Racetrack);
				
				boolean runningRace = true; //once someone wins we can stop this
				while (runningRace) {
					System.out.println(track);
					
					for(int j = 0; j<list.length; j++) {
						String Progress = "";
						for (int k = 0; k < list[j].getCarRaceProgress(); k++)
							Progress+= " ";
						System.out.println(Progress+list[j].getCarSymbol());
									
						//Accelerate based on where you are on the track
						//Racetrack[(int)car1RaceProgress)]
	                    switch (track.charAt((int) list[j].getCarRaceProgress())) {
                        case '-': //strait-away
                            if (list[j].getCarCurrentSpeed() < list[j].getCarTopSpeed())
                                list[j].setCarCurrentSpeed(list[j].getCarCurrentSpeed() + list[j].getCarAcceleration());
                            else if (list[j].getCarCurrentSpeed() > list[j].getCarTopSpeed())
                                list[j].setCarCurrentSpeed(list[j].getCarTopSpeed());
                            break;
                        case 'S': //Chicane
                            if (list[j].getCarCurrentSpeed() < list[j].getCarTopSpeed() * list[j].getCarHandlingS())
                                list[j].setCarCurrentSpeed(list[j].getCarCurrentSpeed() + list[j].getCarAcceleration());
                            else if (list[j].getCarCurrentSpeed() > list[j].getCarTopSpeed() * list[j].getCarHandlingS())
                                list[j].setCarCurrentSpeed(list[j].getCarTopSpeed() * list[j].getCarHandlingS());
                            break;
                        case 'C': //curve
                            if (list[j].getCarCurrentSpeed() < list[j].getCarTopSpeed() * list[j].getCarHandlingC())
                                list[j].setCarCurrentSpeed(list[j].getCarCurrentSpeed() + list[j].getCarAcceleration());
                            else if (list[j].getCarCurrentSpeed() > list[j].getCarTopSpeed() * list[j].getCarHandlingC())
                                list[j].setCarCurrentSpeed(list[j].getCarTopSpeed() * list[j].getCarHandlingC());
                            break;
                        case 'U': //Hairpin
                            if (list[j].getCarCurrentSpeed() < list[j].getCarTopSpeed() * list[j].getCarHandlingU())
                                list[j].setCarCurrentSpeed(list[j].getCarCurrentSpeed() + list[j].getCarAcceleration());
                            else if (list[j].getCarCurrentSpeed() > list[j].getCarTopSpeed() * list[j].getCarHandlingU())
                                list[j].setCarCurrentSpeed(list[j].getCarTopSpeed() * list[j].getCarHandlingU());
                            break;
							}
							//increase progress
							list[j].setCarRaceProgress(list[j].getCarRaceProgress() + list[j].getCarCurrentSpeed());
							
							if (list[j].getCarRaceProgress() >= raceLength) {
								System.out.println(list[j].getName()+" wins");
								list[j].setCarWins(list[j].getCarWins()+1);
								runningRace=false;
							}
						}
					}
				
					//Reset cars position and speed
					for(int j = 0; j<list.length; j++) {
						list[j].setCarRaceProgress(0);
						list[j].setCarCurrentSpeed(0);
					}
				}
				
			//Declares season winner
				int maxWins = 0;
				String winner = " ";
				for(int n = 0; n<list.length; n++) {
					if(list[n].getCarWins() > maxWins){
						maxWins = list[n].getCarWins();
						winner = list[n].getName();
					}
					
				}
				System.out.print("The winner of the season is "+ winner + " with "+ maxWins + " wins.");
			}
}
