import java.util.Scanner;
import java.util.Random;	

public class Problem_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three digit number: ");
		int userNum = input.nextInt();
		input.close();
		
		Random rand = new Random();
		int lottery = rand.nextInt(900) + 100;
		
		int lotteryD1 = lottery / 100;
		int lotteryD2 = (lottery % 100) / 10;
		int lotteryD3 = (lottery % 100) % 10;
		
		int userNumD1 = userNum / 100;
		int userNumD2 = (userNum % 100) /10;
		int userNumD3 = (userNum % 100) % 10;
		
		System.out.print("The lottery number is " + lottery + ". ");
		
		if(userNumD1 == lotteryD1 && userNumD2 == lotteryD2 && userNumD3 == lotteryD3) {
			System.out.print("You win $10,000.");
		} else if ((userNumD1 == lotteryD2 || userNumD1 == lotteryD3) &&
				   (userNumD2 == lotteryD1 || userNumD2 == lotteryD3) && 
				   (userNumD3 == lotteryD1 || userNumD3 == lotteryD2)) {
			System.out.print("You win $3,000.");
		} else if ((userNumD1 == lotteryD1 || userNumD1 == lotteryD2 || userNumD1 == lotteryD3) ||
				   (userNumD2 == lotteryD1 || userNumD2 == lotteryD2 || userNumD2 == lotteryD3) || 
				   (userNumD3 == lotteryD1 || userNumD3 == lotteryD2 || userNumD3 == lotteryD3)) {
			System.out.print("You win $1,000.");
		} else {
			System.out.println("Better luck next time!");
		}
	}
}
