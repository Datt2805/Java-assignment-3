class HelloThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WorldThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("World");
            try {
                Thread.sleep(3000); // Sleep for 3000 milliseconds (3 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class  displays_millisec {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        WorldThread worldThread = new WorldThread();

        helloThread.start();
        worldThread.start();
    }
}
