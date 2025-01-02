package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		System.out.println("simple: " + list1);
 		list1.stream().forEach(l -> System.out.println("Stream Api: " + l)); // print elements using stream API-

		// list even numbers
		List<Integer> listEven = new ArrayList<>();
		for (Integer even : list1) {
			if (even % 2 == 0) {
				listEven.add(even);
			}
		}
		System.out.println(listEven);
		
		//Now by stream API
//		Stream<Integer> stream = list1.stream();
//		List<Integer> listEven2 = stream.filter(i -> i % 2 == 0)
//				.collect(Collectors.toList());
//		System.out.println("By Stream API: " + listEven2);
		
		//           OR
		
		List<Integer> listEven2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("By Stream API: " + listEven2);
		
		String[] digits = {"Lal", "JP", "Lobash","Nariii"};
		Stream<String> stream = Stream.of(digits);
		stream.forEach(d -> System.out.println(d));
		
		IntStream streamInt = Arrays.stream(new int[] {1,2,3,4,5}); // anonymous array-----
		streamInt.forEach(ii -> System.out.println(ii));
	}
}
