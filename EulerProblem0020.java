//What are the sum of the digits of 100!?

import java.math.BigInteger;

public static void main(String[] args) {
    BigInteger factorial = getFactorial(BigInteger.ONE, BigInteger.ONE);
    int sum = 0;
    String asString = factorial.toString();
    for (int i = 0; i < asString.length(); i++) {
        int digit = Character.getNumericValue(asString.charAt(i));
        sum += digit;
    }
    System.out.println(sum);
}

public static BigInteger getFactorial(BigInteger multiplier, BigInteger curr) {
    if (multiplier.equals(BigInteger.valueOf(101))) return curr;
    else {
        return getFactorial(multiplier.add(BigInteger.ONE), curr.multiply(multiplier));
    }
}