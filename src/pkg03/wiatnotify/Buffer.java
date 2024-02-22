package pkg03.wiatnotify;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private static final int MAX_SIZE = 5;
    private  Queue<Integer> items = new LinkedList<>();

    public synchronized void put(int item) throws InterruptedException {
        while (items.size() == MAX_SIZE){
            wait(); // Producer waits if the buffer is full
        }
        items.add(item);
        notify(); // Notify the consumer that an item is added
    }

    public synchronized int get() throws InterruptedException {
        while (items.isEmpty()){
            wait(); // Consumer waits if the buffer is empty
        }
        int item = items.remove();
        notify(); // Notify the producer that an item is removed
        return item;
    }
}
