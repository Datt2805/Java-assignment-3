// Implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, World! (Runnable)");
    }
}

// Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, World! (Thread)");
    }
}

public class basic_thread {
    public static void main(String[] args) {
        // Create and start a thread using the Runnable interface
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();

        // Create and start a thread by extending the Thread class
        Thread threadThread = new MyThread();
        threadThread.start();
    }
}
