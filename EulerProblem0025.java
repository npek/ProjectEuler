//What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

import java.math.BigInteger;

public static void main(String[] args) {
    BigInteger f = BigInteger.ONE;
    System.out.println(fibonacci(f, f, 2));
}

public static int fibonacci(BigInteger one, BigInteger two, int index) {
    String asString = two.toString();
    if (asString.length() == 1000) return index;
    else {
        index++;
        BigInteger newOne = two;
        two = two.add(one);
        return(fibonacci(newOne, two, index));
    }
}