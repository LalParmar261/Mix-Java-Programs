package programs;

import java.util.Scanner;

public class FindBitOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		System.out.println("The Binary of " + n + " is: " + Integer.toBinaryString(n));
	}
}
