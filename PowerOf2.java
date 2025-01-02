package programs;

import java.util.Scanner;

public class PowerOf2 { // Power of Two: like 2,4,8,16,32.....
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		boolean ans = (n & (n-1)) == 0;
		System.out.println("Output is: " + ans);
	}
}
