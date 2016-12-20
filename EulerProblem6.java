//Find the difference between the sum of the squares of the first one hundred 
//natural numbers and the square of the sum.

public static void main(String[] args) {
    int sum = 0;
    int square = 0;
    for (int i = 1; i <= 100; i++) {
        square += i;
        sum += i*i;
    }
    square *= square;
    System.out.println(square - sum);
}