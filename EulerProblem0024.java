//What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList<Long> digitList = new ArrayList<>();
    for (int i = 0; i < 10; i++) digitList.add((long)i);
    long sum = 0;
    int currentDigit = 0;
    long currentMultiplier = 0;
    String number = "";
    while (sum < 1000000) {
        if (sum + (currentMultiplier+1)*factorial(9-currentDigit) > 1000000) {
            if (sum + (currentMultiplier)*factorial(9-currentDigit) == 1000000) {
                if (currentDigit != 9) {
                    sum += (currentMultiplier-1)*factorial(9-currentDigit);
                    number += digitList.get((int)(currentMultiplier-1));
                    digitList.remove((int)(currentMultiplier-1));
                    currentDigit++;
                    currentMultiplier = 0;
                }
                else {
                    sum += (currentMultiplier)*factorial(9-currentDigit);
                    number += digitList.get(0);
                }
            }
            else {
                sum += (currentMultiplier)*factorial(9-currentDigit);
                number += digitList.get((int)currentMultiplier);
                digitList.remove((int)currentMultiplier);
                currentDigit++;
                currentMultiplier = 0;
            }
        }
        else currentMultiplier++;
    }
    System.out.println(number);
}

public static long factorial(int n) {
    long product = 1;
    for (int i = 1; i <= n; i++) product *= i;
    return product;
}