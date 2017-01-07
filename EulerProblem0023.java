//Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList<Integer> abundants = findAbundantNumbers();
    int[] summable = new int[28123];
    long total = 0;
    for (int i = 0; i < 28123; i++) {
        summable[i] = -1;
    }
    for (int i = 0; i < abundants.size(); i++) {
        for (int j = 0; j < abundants.size(); j++) {
            int sum = abundants.get(i)+abundants.get(j);
            if (sum <= 28123) {
                if (summable[sum-1] == -1) {
                    summable[sum-1] = 1;
                }
            }
        }
    }
    for (int i = 0; i < 28123; i++) {
        if (summable[i] == -1) {
            total += i + 1;
        }
    }

    System.out.println(total);
}

public static ArrayList<Integer> findAbundantNumbers() {
    ArrayList<Integer> abundants = new ArrayList<>();
    for (int i = 1; i <= 28123; i++) {
        int sum = 0;
        for (int j = 1; j <= Math.pow(i, 0.5); j++) {
            if (i%j == 0) {
                if ((j == 1) || (j == Math.pow(i, 0.5))) sum += j;
                else sum += j + (i/j);
            }
        }
        if ((sum > i) && (sum <= 28123)) abundants.add(i);
    }
    return abundants;
}