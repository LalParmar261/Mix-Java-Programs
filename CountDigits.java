package programs;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		// By converting to string 
		String string = Integer.toString(n);
		int c = string.length();
		System.out.println("Total No of Digits are: " + c);
		
		// simple
		int sum = 0;
		int count = 0;
		while (n>0) {
			int a = n % 10;
			sum = sum + a;
			n = n/10;
			count++;
		}
		System.out.println("Sum is: " + sum); // it will prints sum of digits
		System.out.println("No. of Digits are: " + count);
		
		
	}
}
