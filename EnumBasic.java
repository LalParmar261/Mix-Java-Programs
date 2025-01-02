package programs;

public class EnumBasic {
	enum Week{

		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
		// these above are enum constants.
		// these are public static and final 
		// since its final you can't create child.
		// type of these enums are Week.
	}
	public static void main(String[] args) {
		Week week;
		week = Week.Monday;
		System.out.println(week);
		
		System.out.print("Days Of Week: ");
		for (Week day : Week.values()) {
			System.out.print(day + " ");
		}
		
	}
}
