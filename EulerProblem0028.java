// 21 22 23 24 25
// 20  7  8  9 10
// 19  6  1  2 11
// 18  5  4  3 12
// 17 16 15 14 13

// What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

import java.math.BigInteger;

public static void main(String[] args) {
    BigInteger num = BigInteger.valueOf(1);
    int square = 2;
    BigInteger sum = BigInteger.valueOf(1);

    while (square < 1001) {
        for (int i = 0; i < 4; i++) {
            num = num.add(BigInteger.valueOf(square));
            sum = sum.add(num);
        }
        square += 2;
    }
    System.out.println(sum);
}