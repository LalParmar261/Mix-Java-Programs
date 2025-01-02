package programs;

public class PrintAtoZ {
	public static void main(String[] args) {
		System.out.println("Alphabet: ");
		
		// using for loop
//		for (char i = 'A'; i <= 'Z'; i++) {
//			System.out.print(i + " ");
//		}
		
//		using while loop
		char a = 'A';
		while (a <= 'Z') {
			System.out.print(a + " ");
			a++;
		}
	}
}
