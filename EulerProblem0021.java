//Evaluate the sum of all the amicable numbers under 10000.

public static void main(String[] args) {
    int amicableSum = 0;
    int[] numbers = new int[10000];
    for (int i = 0; i < 10000; i++) numbers[i] = -1;
    boolean done = false;
    int curr = 0;
    while (!done) {
        numbers[curr] = divisorSum(curr+1);
        if ((curr + 1 != numbers[curr]) && (numbers[curr] <= 10000)) {
            if (numbers[numbers[curr]-1] == -1) {
                numbers[numbers[curr]-1] = divisorSum(numbers[curr]);
            }
            if (numbers[numbers[curr]-1] == (curr+1)) amicableSum += curr + numbers[curr] + 1;
        }
        while ((numbers[curr] > 0) && !done) {
            if (curr >= 9999) done = true;
            else curr++;
        }
    }
    System.out.println(amicableSum);
}

public static int divisorSum(int num) {
    int sum = 0;
    for (int i = 1; i <= Math.pow(num, 0.5); i++) {
        if (num%i == 0) {
            sum += i;
            if ((i != Math.pow(num, 0.5)) && (i != 1)) sum += num/i;
        }
    }
    return sum;
}