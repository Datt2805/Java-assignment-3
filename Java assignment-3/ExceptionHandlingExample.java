// Write a program to handled unchecked exception and explain about Error class.
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // This line will throw a NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        // Simulate a StackOverflowError by calling a recursive method
        try {
            recursiveMethod(0);
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int count) {
        if (count < 10) {
            recursiveMethod(count + 1);
        }
    }
}
