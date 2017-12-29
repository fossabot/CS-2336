import java.util.Scanner;

public class Problem_3 {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter SSN (DDD-DD-DDDD): ");
		String userSSN = input.nextLine();
		input.close();
		boolean valid = true;
		
		if(userSSN.length() == 11) {
			if(userSSN.charAt(3) != '-' && userSSN.charAt(6) != '-') {
				valid = false;
			}
		
			for(int i = 0; i < userSSN.length() && valid; i++){
				if(i != 3 && i != 6) {
					valid = Character.isDigit(userSSN.charAt(i));
				}
			}
		} else {
			valid = false;
		}
		
		if(valid){
			System.out.print("Valid");
		} else {
			System.out.print("Invalid input");
		}
		
	}
}
