// n^2 + an + b
// |a|, |b| < 1000
// find the product of the coefficients, a and b, for the quadratic expression that produces 
// the maximum number of primes for consecutive values of n, starting with n=0.

import java.util.ArrayList;

public class Main {

    static int maxPrimes;
    static ArrayList<Integer> knownPrimes;
    static int maxA;
    static int maxB;

    public static void main(String[] args) {
        knownPrimes = new ArrayList<>();
        maxPrimes = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                // Since it must hold true for n = 0, 0 + 0 + b must be prime
                if (isPrime(j)) {
                    computeConsecutivePrimes(i, j);
                    computeConsecutivePrimes(i*(-1), j);
                    computeConsecutivePrimes(i, j*(-1));
                    computeConsecutivePrimes(i*(-1), j*(-1));
                }
            }
        }

        System.out.println(maxA*maxB);
    }

    public static boolean isPrime(int num) {
        if (knownPrimes.contains(num)) return true;
        if (num < 0) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) {
                return false;
            }
        }
        knownPrimes.add(num);
        return true;
    }

    public static void computeConsecutivePrimes(int a, int b) {
        int i = 0;
        while (isPrime(i*i + a*i + b)) {
            i++;
        }
        if (maxPrimes < i) {
            maxPrimes = i;
            maxA = a;
            maxB = b;
        }
    }
}