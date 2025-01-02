package programs;

public class Constructors {
	String name;
	int age;
	
	public Constructors(String name, int age) {
		if (age<0) {
			throw new IllegalArgumentException("Age cannot be negative.");
		}
		//System.out.println("Valid age");
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Constructors con = new Constructors("Lal", -1);
	}
}
