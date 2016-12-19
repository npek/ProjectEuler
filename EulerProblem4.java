//Find the largest palindrome made from the product of two 3-digit numbers.

public static void main(String[] args) {
    int max = 0;
    for (int i = 100; i < 999; i++) {
        for (int j = 100; j < 999; j++) {
            int product = i*j;
            if (palindrome(product) && (product > max)) max = product;
        }
    }
    System.out.println(max);
}

public static boolean palindrome(int num) {
    String asString = Integer.toString(num);
    int len = asString.length();
    boolean match = true;
    for (int i = 0; i < len/2; i++) {
        if (asString.charAt(i) != asString.charAt(len-i-1)) match = false;
    }
    return match;
}