/*  Write a program to generate customize exception named “NotAllowedToVote” if the age of
the voter is less than 18 years.*/
class NotAllowedToVoteException extends Exception {
    NotAllowedToVoteException(String msg) {
        super(msg);
    }
}

public class VotingAgeChecker {
    public static void main(String[] args) {
        try {
            int age = 15; // Change the age as needed
            vote(age);
        } catch (NotAllowedToVoteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void vote(int age) throws NotAllowedToVoteException {
        if (age < 18) {
            throw new NotAllowedToVoteException("Not eligible for voting. Minimum age required is 18.");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}
