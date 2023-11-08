/*Write a Java program that reads an array element of integers from the user and throws an
exception if any numbers are duplicates. */
import java.util.*;
public class duplicates_numbwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        try {
            checkForDuplicates(arr);
            System.out.println("No duplicate numbers found in the array.");
        } catch (DuplicateNumberException e) {
            System.err.println("Duplicate numbers found: " + e.getMessage());
        }
    }
    
    static void checkForDuplicates(int[] arr) throws DuplicateNumberException {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (!set.add(num)) {
                throw new DuplicateNumberException("Duplicate number: " + num);
            }
        }
    }
}
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
