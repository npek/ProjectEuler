//By considering the terms in the Fibonacci sequence whose values 
//do not exceed four million, find the sum of the even-valued terms.

public static void main(String[] args) {
    int fib = 1;
    int sum = 0;
    int first = 0;
    int second = 1;
    while (fib < 4000000) {
        fib = first + second;
        second = first;
        first = fib;
        if (fib % 2 == 0) sum += fib;
    }
    System.out.println(sum);
}