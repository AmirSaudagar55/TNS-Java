public class Iterative_Factorial {
    public static void main(String[] args) {
        int number = 5; 
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
