package programs;

public class ReverseString {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Lal Parmar"); // By stringBuffer class
		System.out.println(sb.reverse());
		
		
		StringBuilder sbs = new StringBuilder("Lala"); // By StringBuilder class
		System.out.println(sbs.reverse());
		
		// normally...............
		String a = "Lala";
		String b = "";
		int len = a.length();
		for (int i = len-1; i >= 0; i--) {
			b = b+a.charAt(i);
		}
		System.out.println(b);		
	}
}
