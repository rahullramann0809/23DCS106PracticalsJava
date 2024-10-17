public class ExceptionExample {
    
    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }
 
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            
            double result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
