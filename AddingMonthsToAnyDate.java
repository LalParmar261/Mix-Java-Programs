package random;

import java.time.LocalDate;
import java.util.Scanner;

public class AddingMonthsToAnyDate { // add/minus - days/Months/years-----------------
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Year [YYYY]: ");
		int y = sc.nextInt();
		System.out.println("Enter Your Month [MM]: ");
		int m = sc.nextInt();
		System.out.println("Enter Your Day [DD]: ");
		int d = sc.nextInt();
		
//		System.out.println("Enter the month you want to add: ");
//		int addMonth = sc.nextInt();
//		LocalDate ld1 = LocalDate.of(y, m, d);
//		LocalDate ld2 = ld1.plusMonths(addMonth); // add months----
//		System.out.println("New Date is: " + ld2.toString());
		
		System.out.println("Enter the month you want to minus: ");
		int subMonth = sc.nextInt();
		LocalDate ld3 = LocalDate.of(y, m, d);
		LocalDate ld4 = ld3.minusMonths(subMonth); // minus months----
		System.out.println("New Date is: " + ld4.toString());
	}
}
