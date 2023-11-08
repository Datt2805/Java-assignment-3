// Write a program in Java to handle NumberFormatException.
public class NumberFormatException {
    public static void main(String[] args) {
        String str = "123";
        try{
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("String "+ str +" can't be converted to Integer");
        }
    }
}
