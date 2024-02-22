package pkg01.fundamentals;

public class ThreadDemo {
    public static void main(String[] args) {
        EvenNumbersThread evenThread = new EvenNumbersThread(0, 10); // go to the new stage
        evenThread.start(); // need to be started in order to run the task - moved to the Runnable stage

//        evenThread.run(); // means it run within the main thread (only one thread - main)

        System.out.println("End of thread: " + Thread.currentThread().getName());
    }
}
