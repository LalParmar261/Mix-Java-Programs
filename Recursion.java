package programs;

public class Recursion {
	static void printHello(int n) {
		if (n == 0) { // base case
			return;
		}
		System.out.println("Hello");
		printHello(n - 1); // calling same method---------* //generalization...
	}
	static int sum(int n) {
		if (n == 1) {// base case
			return 1;
		}
		return n + sum(n - 1); //generalization... sum(n-1) is the subproblem.
	}
	public static void main(String[] args) {
		printHello(5);
		System.out.println(sum(5)); // sum of natural numbers----*
	}
}
