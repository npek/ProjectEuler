//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public static void main(String[] args) {
    long product = 1L;
    for (int i = 2; i <= 20; i++) {
        product *= i;
    }
    for (int j = 20; j >= 2; j--) {
        boolean okToDivide = true;
        while ((product%(j*j) == 0) && okToDivide) {
            for (int i = 2; i <= 20; i++) {
                if (product%(j*i) != 0) okToDivide = false;
            }
            if (okToDivide) product /= j;
        }
    }
    System.out.println(product);
}