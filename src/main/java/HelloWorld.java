public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, CI/CD Pipeline with Docker!");
        System.out.println("Application is running successfully!");
        
        // Keep the application running for container
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            System.out.println("Application interrupted");
        }
    }
}

