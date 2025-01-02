package random;

public class FilterString { // filter the list..
	
	public static void main(String[] args) {
		String [] names = {"Lal", "Lala", "JP", "Zee", "Didi","Lhr"};
		for (String name : names) {
			if (name.startsWith("L")) {
				System.out.print(name + " ");
			}
		}
	}
	
}

//Output: Lal Lala Lhr 