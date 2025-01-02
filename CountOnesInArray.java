package programs;

public class CountOnesInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,1,1,6,7};
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		System.out.println(count);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
	}
}
