package random;

public class ForNameMethod_LoadcClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Abc abc = new Abc();
		
		// if you dont want to create the object and still you want to call static method then you have to load the class, like below:
		Class.forName("Abc").newInstance(); // forName method will load the class and newInstance will create the object
	}
}
class Abc{
	static { // Before creating the object, firstly load the class and while loading class it will call static block.
		System.out.println("In static block.");
	}
	// instance - after creating the object it will call instance block.
	{
		System.out.println("In instance block");
	}
}
