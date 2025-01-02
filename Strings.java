package random;

public class Strings {
	public static void main(String[] args) {
		// use case of endsWith---------------*
		String fileName = "document.pdf";
		if (fileName.endsWith(".pdf")) {
			System.out.println("This is a PDF file.");
		}
		String domain = "www.domain.com";
		if (domain.endsWith(".com")) {
			System.out.println("This is commercial domain.");
		}
	}
}
