package programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelPrinter {
    public static void main(String[] args) {

    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the String: ");
    	  String input = sc.nextLine();
        
        
//        String input = "Hello World";
//        System.out.println("Input String: " + input);
        System.out.println("Vowels are: ");
        printVowels(input);
        System.out.println();
        printVowel(input);
    }

    public static void printVowels(String input) { // 1st way
 
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
    }
    public static void printVowel(String str) { // 2nd way.....

        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}

