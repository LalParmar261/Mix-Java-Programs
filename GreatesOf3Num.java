package programs;

public class GreatesOf3Num {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		
		if (a>b || a>c) {
			System.out.println(a);
		} else if (b>c) {
			System.out.println(b);
		} 
		else {
			System.out.println(c);
		}
	}
}
