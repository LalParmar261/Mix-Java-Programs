package programs;

import java.util.Scanner;

public class TribonacciSeries { // prints the tribonacxi Series. 
	public static void main(String[] args) {
		int num, a = 0, b = 1, c = 2, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			System.out.print(a + " ");
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
	}
}
