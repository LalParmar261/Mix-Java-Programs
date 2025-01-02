package programs;

import java.util.Optional;

record Point(int x, int y) {} // record class------------*
public class Classes {
	public static void main(String[] args) {
		Point point = new Point(2, 6);
		System.out.println(point.x());
		System.out.println(point.y());
		System.out.println(point);
		
		String n = "261";
		int result = Integer.parseInt(n); // Parse class---------*
		System.out.println(result); // 261
		
//		Wrapper class:
		Integer number = Integer.valueOf(261); // wraps primitive int in an Integer object.
		System.out.println(number);
		int primitiveNum = number.intValue(); // unwrap back to primitive.
		System.out.println(primitiveNum);
		
		Optional<String> name = Optional.ofNullable(null);
		System.out.println(name.orElse("No Name"));
		
	}
}

//Output:
//	2
//	6
//	Point[x=2, y=6]
