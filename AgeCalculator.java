package random;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your DOB [DD/MM/YYYY]: ");
		String dob = sc.next();
		String [] arr = dob.split("/");
		int d = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int y = Integer.parseInt(arr[2]);
		
		var d1 = LocalDate.of(y, m, d);
		var d2 = LocalDate.now();
		
		var p = Period.between(d1, d2);
		System.out.println("Now Your Age is: " + p.getYears() + "/" + p.getMonths() + "/" + p.getDays());
		
		
	}
}
