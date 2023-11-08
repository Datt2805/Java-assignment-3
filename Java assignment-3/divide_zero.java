// Write a program in Java to handle divide by zero exception
public class divide_zero {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try{
            c = a/b;
            System.out.println(c);
        } catch(Exception e){
            System.out.println("Exception "+ e);
        }
    }
}