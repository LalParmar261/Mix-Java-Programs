package programs;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate birthday = LocalDate.of(2001, Month.JUNE, 02);
		System.out.println(birthday);
		
		Period age = Period.between(birthday, today);
		System.out.println("Age: " + age.getYears());
	}
}
