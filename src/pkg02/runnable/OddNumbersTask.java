package pkg02.runnable;

public class OddNumbersTask implements Runnable{
    private final int begin;
    private final int end;

    public OddNumbersTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = begin; i < end; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("End of thread: " + Thread.currentThread().getName());
    }
}
