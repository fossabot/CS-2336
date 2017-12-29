/*CS2336 HW2 PROBLEM1 GOETTEN
This program partitions a list of N integers by moving
values less than or equal to the pivot to its left 
*/
import java.util.Scanner;
public class Problem_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of integers (first is the size): ");
		//Get user input
		int size = input.nextInt();                                                                           
		//Creates partition array
		int partArr[] = new int[size];
		
		//Fill partition array with input
		for(int i=0; i < size; i++){
			partArr[i] = input.nextInt();
		}
		
		//Pass array to be partition
		partition(partArr, size);
		
		//Pass partition array to partition method
		for(int i=0; i < partArr.length; i++){
			System.out.print(partArr[i] + " ");
		}
		input.close();
	}
	
	//Method returns partitioned list
	public static int partition(int[] list, int size) {
		int pivot = list[0];
		int i = 1;
		int j = size-1;
		while(i<=j) {
			if(list[i] < pivot) {
				i++;
			} else {
				int temp = list[j];
				list[j] = list[i];
				list[i] = temp;
				j--;
			}
		} int temp = list[0];
			list[0] = list[j];
			list[j] = temp;
		return 0;
	}
}