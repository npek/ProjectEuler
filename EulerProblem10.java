//Find the sum of all the primes below two million.

public static void main(String[] args) {
    int num = 1999999;
    long sum = 2;
    while (num > 2) {
        if (isPrime(num)) sum += num;
        num -= 2;
    }
    System.out.println(sum);
}

public static boolean isPrime(int num) {
    for (int i = 2; i <= Math.pow(num, 0.5); i++) {
        if (num%i == 0) return false;
    }
    return true;
}