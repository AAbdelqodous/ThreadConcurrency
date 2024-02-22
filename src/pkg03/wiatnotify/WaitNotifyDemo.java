package pkg03.wiatnotify;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer, "producer thread");
        Thread consumerThread = new Thread(consumer, "consumer thread");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End of thread: " +Thread.currentThread().getName());
    }
}
