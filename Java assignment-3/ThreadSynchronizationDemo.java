class SharedResource {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private SharedResource sharedResource;

    public IncrementThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            sharedResource.increment();
        }
    }
}

public class ThreadSynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();

        IncrementThread thread1 = new IncrementThread(sharedResource);
        IncrementThread thread2 = new IncrementThread(sharedResource);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + sharedResource.getCount());
    }
}
