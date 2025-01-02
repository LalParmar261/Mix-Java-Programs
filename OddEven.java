package programs;

import java.util.Scanner;

public class OddEven {
	public static boolean isOdd(int n) {
		return (n & 1) == 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		System.out.println("Odd: " + isOdd(sc.nextInt()));
	}
}
