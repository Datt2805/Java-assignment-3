// Write a program in Java to handle ArrayIndexOutOfBoundsException.
public class ArrayIndexOutOfBoundsException {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            
            try {
                int index = 7;  // This index is out of bounds
                int value = numbers[index];
                System.out.println("Value at index " + index + " is: " + value);
            } catch (Exception e) {
                System.out.println("Exception occurred. "+ e);
            }
        }

    
}
