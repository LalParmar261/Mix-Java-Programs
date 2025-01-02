package programs;

import java.util.Scanner;

public class PrintASCII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		
		int a = c;
		System.out.println("ASCII value of " + c + " is: " + a);
	 }
}
