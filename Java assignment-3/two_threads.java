class SumCalculator implements Runnable {
    private int start;
    private int end;
    private int result;

    public SumCalculator(int start, int end) {
        this.start = start;
        this.end = end;
        this.result = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            result += i;
        }
    }

    public int getResult() {
        return result;
    }
}

public class two_threads {
    public static void main(String[] args) {
        int n = 20;
        int midpoint = n / 2;

        SumCalculator calculator1 = new SumCalculator(1, midpoint);
        SumCalculator calculator2 = new SumCalculator(midpoint + 1, n);

        Thread thread1 = new Thread(calculator1);
        Thread thread2 = new Thread(calculator2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = calculator1.getResult() + calculator2.getResult();
        System.out.println("Sum of numbers from 1 to " + n + " is: " + totalSum);
    }
}
