package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaysToCreateLists {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4,5); // 1 - way
		System.out.println(list1);
		
		
		List<Integer> list2 = new ArrayList<>(); // 2 - way
		list2.addAll(list1);
		System.out.println(list2);
		
		
//		List<List<Integer>> list3 = Arrays.asList(list1); // 3 - way
		List<Integer> list3 = Arrays.asList(1,2,3,4,5); // 3 - way
		System.out.println(list3);
		
		
	}
}
