package programs;

public class StringClass { // Two ways to create the string object 1. literal 2. new keyword
	public static void main(String[] args) {

		String a = "Lal"; // String Literal
		System.out.println(a); // Output: Lal
		
		String b = "Lal";
		System.out.println(b); // Output: Lal
		
		a = a.concat(" Parmar"); // new object created with the name of a, old a is destroyed
		System.out.println(a); // Output: Lal Parmar
		
		String s1 = new String("Lala");
		System.out.println(s1);
		
		String s2 = new String("Lala");
		System.out.println(s2);
		
		s1 = s1.concat(" Parmar");
		System.out.println(s1);
		
	}
}

