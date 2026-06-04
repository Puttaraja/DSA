package Basics.Methods;

public class SynchronizedMethods {

    static class Counter {
        private int synchronizedCount = 0;
        private int asynchronizedCount = 0;

        // synchronized ensures one thread at a time
        public synchronized void incrementSynchronized() {
            synchronizedCount++;
        }

        public int getSynchronizedCount() {
            return synchronizedCount;
        }

        public void incrementAsynchronized() {
            asynchronizedCount++;
        }

        public int getAsynchronizedCount() {
            return asynchronizedCount;
        }
    }

    
    public static void main(String[] args){
        System.out.println("Synchronized Methods:");
        Counter counter = new Counter();
        // Creating multiple threads that access the synchronized method
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.incrementSynchronized();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.incrementSynchronized();
            }
        });

        Thread t3 = new Thread( () -> {
            for (int i = 0; i < 1000000; i++) {
                counter.incrementAsynchronized();
            }
        });

        Thread t4 = new Thread( () -> {
            for (int i = 0; i < 1000000; i++) {
                counter.incrementAsynchronized();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join(); //join method will clear interrupted exception
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Synchronized Count: " + counter.getSynchronizedCount());
        System.out.println("Final Asynchronized Count: " + counter.getAsynchronizedCount());
    }
}
