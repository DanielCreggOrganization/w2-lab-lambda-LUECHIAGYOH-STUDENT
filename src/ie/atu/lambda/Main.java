package ie.atu.lambda;
public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Runnable using a lambda expression
        Runnable task = () -> System.out.println("Hello from the thread");

        // Step 2: Create a new thread with the Runnable
        Thread thread = new Thread(task);

        // Step 3: Start the thread
        thread.start();
    }
}