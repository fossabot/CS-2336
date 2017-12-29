import java.util.Scanner;

public class Problem_5 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter credit card number: ");
		long number = input.nextLong();
		input.close();
		boolean isValid = isValid(number);
		
		if(isValid) {
			System.out.print(number + " is valid.");
		} else {
			System.out.print(number + " is invalid.");
		}
	}
	
	/**Return true if card is valid*/
	public static boolean isValid(long number) {
		boolean valid =
			(getSize(number) >= 13 && getSize(number) <= 16) &&
			(prefixMatched(number, 37) || prefixMatched(number, 6) ||
			prefixMatched(number, 5) || prefixMatched(number, 4)) &&
			((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
		return valid;
	}
	
	/**Get the result from Step 2*/
	public static int sumOfDoubleEvenPlace(long number) {
		String numToStr = Long.toString(number);
		int sum = 0;
		for(int i = (numToStr.length() - 2); i >= 0; i-=2) {
			sum += (getDigit(Character.getNumericValue(numToStr.charAt(i))*2));
		} return sum;
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		String numToStr = Long.toString(number);
		int sum = 0;
		for(int i = (numToStr.length() - 1); i > 0; i-=2) {
			sum += getDigit(Character.getNumericValue(numToStr.charAt(i)));
		} return sum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number) {
		if(number > 9) {
			return ((number % 10)+1);
		} else {
			return number;
		}
	}
	

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		String numToStr = Long.toString(number);
		String dToString = Integer.toString(d);
		int length = dToString.length();
		boolean check = true;
		
		for(int i = 0; i < length; i++) {
			if(numToStr.charAt(i) != dToString.charAt(i)){
				check = false;
			}
		}
		return check;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		return Long.toString(d).length();
	}
	
}