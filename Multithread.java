public class Multithread {

    public static void main(String[] args) {
        // Create and start two threads
        Thread thread1 = new Thread(() -> System.out.println("Message from Thread 1"));
        Thread thread2 = new Thread(() -> System.out.println("Message from Thread 2"));
        thread1.start();
        thread2.start();
    }
}