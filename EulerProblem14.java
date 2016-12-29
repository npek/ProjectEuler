//Which starting number, under one million, produces the longest Collatz
//sequence chain?

public static void main(String[] args) {
    long max = -1;
    long best = 1;
    long n = 2;
    while (n < 1000000) {
        long length = chainLength(n, 0);
        if (length > max) {
            max = length;
            best = n;
        }
        n++;
    }
    System.out.println(best);
}

public static long chainLength(long num, long count) {
    if (num == 1) return count + 1;
    else {
        if (num%2 == 0) num /= 2;
        else num = num*3 + 1;
        return chainLength(num, (count + 1));
    }
}