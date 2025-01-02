package programs;

import java.util.HashSet;
import java.util.Set;

public class Union {
	public static void main(String[] args) {
		int[] Arr1 = {1, 2, 3, 4};
        int[] Arr2 = {3, 4, 5, 6};
        
        Set<Integer> set1 = new HashSet<>();
        for (int num : Arr1) {
			set1.add(num);
		}
        Set<Integer> set2 = new HashSet<>();
        for (int num : Arr2) {
        	set2.add(num);
        }
        
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        
        System.out.println(union);
	}
}
