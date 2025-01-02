package programs;

public class RemoveSpace { // Remove the space among characters or words.
	public static void main(String[] args) {
		String s = "Lal Zee";
		System.out.println("Before: " + s);
		String ss = s.replace(" ", "");
		System.out.println("After: " + ss);
	}
}
