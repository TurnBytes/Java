package basicMultithreading;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Low Priority Thread: " + i);
            }
        });

        // Create second thread with HIGH priority
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("High Priority Thread: " + i);
            }
        });

        // Set priorities
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);   // 1
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // 10

        // Start both threads
        lowPriorityThread.start();
        highPriorityThread.start();
    }
}
