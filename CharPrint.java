package programs;

import java.util.Scanner;

public class CharPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = sc.next().charAt(0);
		System.out.println(c);
	}
}
