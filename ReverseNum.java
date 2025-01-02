package programs;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		System.out.println("Reverse No: ");
		while (n > 0) {
			int r = n % 10;
			System.out.print(r);
		}
	}
}
