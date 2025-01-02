package programs;

public class StringMethods {
	public static void main(String[] args) {
		String a = "Lal ";
		String b = "Parmar";
		String c = "   JP   ";
		String d = "";
		
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.concat(b));
		System.out.println(a.length());
		System.out.println(c.trim());
		System.out.println(d.isEmpty());
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf('a'));
		System.out.println(a.equals(b));
		System.out.println(a.replace('l', 'a'));
	}
}
