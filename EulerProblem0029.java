// How many distinct terms are in the sequence generated by a^b for 2 ≤ a ≤ 100 and 2 ≤ b ≤ 100?

import java.math.BigInteger;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(distinctValues());
    }

    public static int distinctValues() {
        BigInteger current;
        HashSet<BigInteger> values = new HashSet<>();

        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                current = BigInteger.valueOf(a);
                current = current.pow(b);
                if (!values.contains(current)) {
                    values.add(current);
                }
            }
        }

        return values.size();
    }
}