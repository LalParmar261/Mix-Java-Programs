package random;

public class CommandLineArgs {
	public static void main(String[] args) {
		System.out.println("Hello Lal.");
		if(args.length==0)
		{
//			System.out.println("Command Line Args:");
			for (String arg : args) {
				System.out.println("LAl" + arg);
			}
		}else {
			System.out.println("No command line args provided.");
		}
	}
}
