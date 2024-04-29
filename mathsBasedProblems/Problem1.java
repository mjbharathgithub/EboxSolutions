package mathsBasedProblems;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> fibonacciNumbers = generateFibonacci(n);
        List<Integer> primeFibonacciNumbers = findPrimeNumbers(fibonacciNumbers);

        if (primeFibonacciNumbers.isEmpty()) {
            System.out.println("No prime numbers in the Fibonacci series");
        } else {
            for (int num : primeFibonacciNumbers) {
                System.out.print(num + " ");
            }
        }
    }

    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 0, b = 1, c;
        fibonacciNumbers.add(a);
        fibonacciNumbers.add(b);

        while ((c = a + b) <= n) {
            fibonacciNumbers.add(c);
            a = b;
            b = c;
        }

        return fibonacciNumbers;
    }

    public static List<Integer> findPrimeNumbers(List<Integer> numbers) {
        List<Integer> primes = new ArrayList<>();
        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}