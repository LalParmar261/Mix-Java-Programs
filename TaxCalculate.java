package programs;

import java.util.Scanner;

public class TaxCalculate { // finding  the tax of salary.......
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		int sal = sc.nextInt();
		if (sal <= 10000) {
			System.out.println(sal + ": No Tax.");
		} else if(sal > 10000 && sal <= 100000) {
			Double tax = sal * 0.10;
			System.out.println(sal + " : " + tax);
		}
		else {
			double tax = sal * 0.20;
			System.out.println(sal + " : " + tax);
		}
	}
}
