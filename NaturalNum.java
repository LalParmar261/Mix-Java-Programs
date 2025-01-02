package programs;

import java.util.Scanner;

public class NaturalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of term: ");
		int n = sc.nextInt();
		System.out.print("Natural Nos. are: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
}
