package Practices;

class Counter {
    int count;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }
}

public class TreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
                try {
                    Thread.sleep(10); // Introduce a delay of 10 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
                try {
                    Thread.sleep(10); // Introduce a delay of 10 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // Join t1 and t2 with the main thread
        t1.join();
        t2.join();

        // After t1 and t2 have completed, print the value of c.count
        System.out.println(c.count);
    }
}
