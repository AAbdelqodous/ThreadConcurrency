package pkg03.wiatnotify;

public class Producer implements Runnable{
    private final Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.put(i);
                System.out.println("Produced: " +i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End of thread: " +Thread.currentThread().getName());
    }
}
