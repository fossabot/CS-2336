import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's Name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked: ");
		int numOfHours = input.nextInt();
		System.out.print("Enter hourly pay rate: $");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate (eg. 0.2): ");
		double fedTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate (eg. 0.2): ");
		double stateTax = input.nextDouble();
	
		input.close();
		
		double grossPay = payRate*numOfHours;
		double fedDeduction = fedTax*grossPay;
		double stateDeduction = stateTax*grossPay;
		double totalDeduction = stateDeduction + fedDeduction;
		
		double netPay = grossPay - totalDeduction;
		System.out.println("");
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + numOfHours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println(" Federal Withholding (" + (fedTax*100) + "%" + "): $" + fedDeduction);
		System.out.println(" State Withholding: (" + (stateTax*100) + "%" + "): $" + stateDeduction);
		System.out.println(" Total Deduction: $" + totalDeduction);
		System.out.println("Net Pay: $" + netPay);
	}

}
