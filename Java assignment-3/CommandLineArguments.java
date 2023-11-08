/*Write a program to generate customized exception named ArgumentGreaterThanOne if
there is more than one argument in command line*/
class ArgumentGreaterThanOneException extends Exception {
    public ArgumentGreaterThanOneException(String message) {
        super(message);
    }
}

public class CommandLineArguments {
    public static void main(String[] args) {
        try {
            if (args.length > 1) {
                throw new ArgumentGreaterThanOneException("More than one command line argument is not allowed.");
            }

            if (args.length == 1) {
                System.out.println("Command line argument: " + args[0]);
            } else {
                System.out.println("No command line argument provided.");
            }
        } catch (ArgumentGreaterThanOneException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
