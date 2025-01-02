package programs;

import java.util.Scanner;

public class Methods {
	int n1, n2, add, sub, mult, div, rem;
	public static void main(String[] args) {
		Methods methods = new Methods();
		methods.input();
		methods.process();
		methods.output();
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
	}
	void process() {
		add = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		div = n1 / n2;
		rem = n1 % n2;
	}
	void output() {
		System.out.println("Sum is: " + add);
		System.out.println("Sub is: " + sub);
		System.out.println("Mult is: " + mult);
		System.out.println("Div is: " + div);
		System.out.println("Rem is: " + rem);
	}
}
