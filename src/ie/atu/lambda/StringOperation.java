package ie.atu.lambda;

@FunctionalInterface
public interface StringOperation {
    String apply(String str); // Single abstract method (SAM)
}
