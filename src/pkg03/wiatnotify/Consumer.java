package pkg03.wiatnotify;

public class Consumer implements Runnable{
    private final Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <=  10; i++) {
            try {
                int item = buffer.get();
                System.out.println("Consumed: " +item);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End of thread: " +Thread.currentThread().getName());
    }
}
