package random;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Iteration {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Lal");
		names.add("Pamu");
		names.add("JP");
		names.add("Lobash");
		names.add("Sheeraz");
		
		System.out.println("*-------* For Each Loop *-------*");
		for (String string : names) {
			System.out.print(string);
			StringBuffer sb = new StringBuffer(string);
			System.out.println(" : " + sb.reverse());
		}
		
		System.out.println("*-------* Traversing Using Iterator: forward traversing *-------*");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		System.out.println("*-------* Using ListIterator : backward traversing *-------*");
		ListIterator<String> litr =	names.listIterator(names.size());
		while (litr.hasPrevious()) {
			String string = litr.previous();
			System.out.println(string);
		}
		
		System.out.println("*-------* Using ForEach method *-------*");
		names.forEach(str -> {System.out.println(str);});
		
		System.out.println("*-------* Sorting Elements: *-------*");
		TreeSet<String> ts = new TreeSet<>();
		ts.addAll(names);
		ts.forEach(s -> System.out.println(s));
	}
}
