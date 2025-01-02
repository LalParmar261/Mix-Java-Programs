package random;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIMethods {
	public static void main(String[] args) {
		
		/*
		 * Filter Method:
		 * filter(Predicate)
		 * boolean value function
		 * i -> i > 10
		 */
		
		List<String> names = List.of("Aaaa", "Bbbb", "Cccc", "Aaaaa");
		List<String> newNames = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		
		/*
		 * Map Method:
		 * map(function)
		 * each element operation
		 */
		
		List<Integer> num = List.of(1,3,2,4,5);
		List<Integer> newNum = num.stream().map(nu -> nu*nu).collect(Collectors.toList());
		System.out.println(newNum);
		
		newNum.stream().sorted().forEach(System.out::println); // Sorted Method------*
		
		Integer minn = num.stream().min((a,b) -> a.compareTo(b)).get(); // min method
		System.out.println("Min is: " + minn);
		
		Integer maxx = num.stream().max((a,b) -> a.compareTo(b)).get(); // max method  
		System.out.println("Max is: " + maxx);
	}
}
