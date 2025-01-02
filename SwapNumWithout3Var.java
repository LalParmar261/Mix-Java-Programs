package programs;

import java.util.Scanner;

public class SwapNumWithout3Var { //  Swap two numbers without 3rd variable...   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before Swaping: "+ a + " : "+ b);
		a = a + b; 
		b = a - b;
		a = a - b;
		System.out.println("After Swaping: "+ a + " : "+ b);
	}
}
