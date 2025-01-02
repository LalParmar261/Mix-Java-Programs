package programs;

public class FndUniqueInArray {
	public static int findUnique(int[] arr) {
		int unique = 0;
		for (int i : arr) {
			unique ^= i;
		}
		return unique;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3,1,2,3,4};
		System.out.println("Unique is: " + findUnique(arr));
	}
}

//Output:
//	Unique is: 4
