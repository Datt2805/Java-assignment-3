// Write a program to demonstrate the use of access modifier.
public class accessModifier {
    public int pb = 10;
    private int pr = 20;
    protected int pro = 30;
    int df = 40; 

    public void pbM(){
        System.out.println("Public method called");
    }

    private void prM(){
        System.out.println("Private method called");
    }

    protected void proM(){
        System.out.println("protected method called");
    }

    void dfM(){
        System.out.println("Default method called");
    }

    public static void main(String[] args) {
        accessModifier demo = new accessModifier();

        System.out.println("Public: "+demo.pb);
        System.out.println("Private: "+demo.pr);
        System.out.println("protected: "+demo.pro);
        System.out.println("Default: "+demo.df);

        demo.pbM();
        demo.prM();
        demo.proM();
        demo.dfM();
    }
}
