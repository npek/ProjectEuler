//What is the 10,001st prime number?

public static void main(String[] args) {
    int primesFound = 1;
    int count = 2;
    while (primesFound != 10001) {
        count++;
        if (checkPrime(count)) primesFound++;
    }
    System.out.println(count);
}

public static boolean checkPrime(int num) {
    for (int i = 2; i <= Math.pow(num, 0.5); i++) {
        if (num%i == 0) return false;
    }
    return true;
}