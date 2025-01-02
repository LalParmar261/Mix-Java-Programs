package programs;

import java.util.Scanner;

public class PowerOfBase { // calculate the power of any base number.
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base Number: ");
		int base = sc.nextInt();
		System.out.println("Enter the Exponent Number: ");
		int exponent = sc.nextInt();
		
		int result = (int) Math.pow(base, exponent);
		System.out.println(base + " raised to the power of " + exponent + " = " + result);
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base Number: ");
		int base = sc.nextInt();
		System.out.println("Enter the Exponent Number: ");
		int exponent = sc.nextInt();
		
		int result = 1;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		System.out.println(base + " raised to the power of " + exponent + " = " + result);
	}
	public static void main(String[] args) {
		method1();
		method2();  
		
	}
}
