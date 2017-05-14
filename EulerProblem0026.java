import java.math.BigDecimal;
import java.util.Vector;

public static void main(String[] args) {
    int i, currentDividend, len;
    BigDecimal bigI;
    int maxLen = 1;
    int maxD = 3;
    Vector<Integer> remainders;

    for (i = 3; i < 1000; i++) {
        bigI = BigDecimal.valueOf(i);
        try {
            bigI = (BigDecimal.ONE).divide(bigI);
        } catch (ArithmeticException ae) {
            remainders = new Vector<>();
            remainders.add(1);
            currentDividend = 10;
            while (!remainders.contains(currentDividend%i)) {
                remainders.add(currentDividend%i);
                currentDividend = 10*(currentDividend%i);
            }
            len = remainders.size() - remainders.indexOf(currentDividend%i);
            if (len > maxLen) {
                maxLen = len;
                maxD = i;
            }
        }
    }

    System.out.println(maxD);
}