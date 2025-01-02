package programs;

import java.util.Scanner;

public class FibonacciSeries { // Prints the Fibonacci Series.
	public static void main(String[] args) {
		int num, a = 0, b = 1, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}
