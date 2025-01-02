package programs;

import java.util.Arrays;

public class ParallelArraySorting {
	public static void main(String[] args) {
		int n[] = {1,4,2,5,3,8};
		Arrays.parallelSort(n);
		System.out.println(Arrays.toString(n));
	}
}

//output : [1, 2, 3, 4, 5, 8]
