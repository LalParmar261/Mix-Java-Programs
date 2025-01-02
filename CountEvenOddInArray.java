package programs;

import java.util.Scanner;

public class CountEvenOddInArray {
	public static void evenOdd(int arr[]) {
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
//			System.out.println(arr[i] + " is even number.");
				evenCount++;
			}
			else {
//				System.out.println(arr[i] + " is odd number.");
				oddCount++;
			}
		}
		System.out.println("Even: " + evenCount);
		System.out.println("Odd: " + oddCount);
	}
	public static void main(String[] args) {
		System.out.println("Array size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the Elements: ");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		evenOdd(arr);
	}
}
