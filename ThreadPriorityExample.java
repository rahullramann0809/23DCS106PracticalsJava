class CustomThread extends Thread {
    private String threadName;

    public CustomThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
    
        CustomThread firstThread = new CustomThread("FIRST");
        CustomThread secondThread = new CustomThread("SECOND");
        CustomThread thirdThread = new CustomThread("THIRD");

        firstThread.setPriority(3);
        secondThread.setPriority(Thread.NORM_PRIORITY); // Default is 5
        thirdThread.setPriority(7);

        
        firstThread.start();
        secondThread.start();
        thirdThread.start();

        
        try {
            firstThread.join();
            secondThread.join();
            thirdThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have finished execution.");
    }
}
