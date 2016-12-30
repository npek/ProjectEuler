//What is the sum of the digits of 2^1000?

import java.math.BigInteger;

public static void main(String[] args) {
    BigInteger sum = BigInteger.ZERO;
    BigInteger big = BigInteger.valueOf(2);
    big = big.pow(1000);
    while (!big.equals(BigInteger.valueOf(0))) {
        sum = sum.add(big.mod(BigInteger.TEN));
        big = big.divide(BigInteger.TEN);
    }
    System.out.println(sum.toString());
}