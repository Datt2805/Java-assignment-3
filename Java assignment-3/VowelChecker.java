/*Write a Java program to create a method that takes a string as input and throws an
exception if the string does not contain vowels */
import java.util.*;

public class VowelChecker {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter String: ");
            String input = sc.nextLine();

            checkForVowels(input);
            System.out.println("The string contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void checkForVowels(String input) throws NoVowelsException {
        if (!containsVowels(input)) {
            throw new NoVowelsException("The string does not contain any vowels.");
        }
    }

    public static boolean containsVowels(String input) {
        String lowercaseInput = input.toLowerCase();
        return lowercaseInput.matches(".*[aeiou].*");
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
