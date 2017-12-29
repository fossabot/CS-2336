import java.util.Scanner;
	
public class Problem_1 {
		
	public static boolean checkOverlap(double xDist, double yDist, double r1w, double r2w, double r1h, double r2h) {
		boolean overlapped;
		if(xDist <= (r1w+r2w)/2 && yDist <= (r1h+r2h)/2) {
			overlapped = true;
		}
		else { 
			overlapped = false;
		}
			return overlapped;
		}
		
	public static boolean checkInside(double xDist, double yDist, double r1w, double r2w, double r1h, double r2h) {
		boolean inside;
		if(xDist <= (r2w-r1w)/2 && yDist <= (r2h-r1h)/2) {
			inside = true;
		}
		else { 
			inside = false;
		}
			return inside;
		}
		
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		input.close();		
			
		double x_dist = Math.abs(x2-x1);
		double y_dist = Math.abs(y2-y1);
		boolean overlaps = checkOverlap(x_dist,y_dist,w1,w2,h1,h2);
		boolean isInside = checkInside(x_dist,y_dist,w1,w2,h1,h2);
			

		if(overlaps){
			System.out.print("r1 overlaps with r2");
		} else if(isInside) {
			System.out.print("r1 is inside r2");
		} else {
			System.out.print("r1 is outside r2");
		}
	}
}