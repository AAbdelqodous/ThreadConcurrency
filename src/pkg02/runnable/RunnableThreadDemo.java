package pkg02.runnable;

public class RunnableThreadDemo {
    public static void main(String[] args) {
        Runnable oddTask = new OddNumbersTask(1, 10);

        var t1 = new Thread(oddTask, "oddThread"); // -> New state
        t1.start(); // New -> Runnable state

        System.out.println("End of thread: " +Thread.currentThread().getName());
    }
}
