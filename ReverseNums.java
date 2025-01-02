package programs;

import java.util.Scanner;

public class ReverseNums { // *------------- Reverse the Number ----------*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		System.out.println("Reverse No: ");
		while (n > 0) {
			int rev = n % 10;
			System.out.print(rev + " ");
			n = n / 10;
		}
	}
}
