package pkg01.fundamentals;

public class EvenNumbersThread extends Thread{
    private int begin;
    private int end;

    public EvenNumbersThread(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Even Thread");
        for (int i = begin; i < end; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                try {
                    sleep(1000); // put the thread in the Block state
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("End of thread: " + Thread.currentThread().getName());
    } // thread goes to the Dead state.


}
