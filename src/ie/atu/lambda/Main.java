package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ToUpperCase
        StringOperation toUpperCase = new ToUpperCase();
        
        // Test the apply method
        String result = toUpperCase.apply("Hello World!");
        
        // Output the result
        System.out.println("Result: " + result);
    }
}
