package programs;

import java.util.Scanner;

public class FacorOfNumb {
	public static void factorNum(int n) {
		System.out.println("Factors of " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("Invalid Number.");
		} else {
			factorNum(n);
		}
	}
}
