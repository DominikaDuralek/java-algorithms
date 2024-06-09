package other;

import java.math.BigInteger;

public class RecursionExample {
    public static void main(String[] args) {
        System.out.println("Recursion");

        // Recursion - when a thing is defined in terms of itself
        // - when a piece of code calls itself
        // - for example a method calling itself
        // - a problem is divided into sub-problems of the same type
        // - commonly used in advanced sorting algorithms and navigating trees
        // - easier to read/write or debug
        // - it's sometimes slower and uses more memory

        // A method that simulated walking with a number of steps defined
        System.out.println("\nIterative walk method");
        iterativeWalk(5);

        System.out.println("\nRecursive walk method");
        recursiveWalk(5);

        // Factorials
        System.out.println("\nFinding a factorial (smaller numbers - recursive approach)");
        System.out.println(factorial(7));

        System.out.println("\nLarge factorials (just to show that it can be done)");
        System.out.println(bigFactorial(30));

        System.out.println("\nCalculating power");
        int base = 2;
        int exponent = 8;
        System.out.println(base + " to the power of " + exponent + " = " + power(base, exponent));
    }

    // Iterative approach
    private static void iterativeWalk(int steps) {
        System.out.println("Printing a step " + steps + " times");
        for (int i = 0; i < steps; i++) {
            System.out.println("You take a step!");
        }
    }

    // Recursive approach
    private static void recursiveWalk(int steps) {
        // Base case - what happens when recursion stops
        if (steps < 1) {
            System.out.println("Recursion stopped!");
            return;
        }
        // Recursive case
        System.out.println("You take a step! (calling recursiveWalk)");
        recursiveWalk(steps - 1);
    }

    // Factorials of smaller numbers - a simple example
    private static int factorial(int number) {
        // Base case
        if (number < 1) return 1;
        // Recursive case
        return number * factorial(number - 1);
    }

    // Factorial of larger numbers - example
    private static BigInteger bigFactorial(int number) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }

    // Calculating power - recursive approach
    private static int power(int base, int exponent) {
        // Base case
        if (exponent < 1) return 1;
        // Recursive case
        return base * power(base, exponent - 1);
    }
}
