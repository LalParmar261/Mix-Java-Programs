package programs;

public class MethodObject {
	 int test = 20; // instance variable
	public void name1() {
		int test = 10; // this is local variavble
		System.out.println(this.test); // this will call instance variable
		System.out.println(test); // this will call local variable
		
	}
	public static String name(String a) {
		System.out.println("Lal is here....");
		return a;
	}
	public static int a1(int a) {
		return a;
	}
	public static String a1(String a) {
		return a;
	}

	public static void main(String[] args) {
		System.out.println(name("Hello "));
		MethodObject mo = new MethodObject();
		mo.name1();
		System.out.println(a1(1));
		System.out.println(a1("Lal"));
	}
}
