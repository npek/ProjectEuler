//If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would 
//be used?

public static void main(String[] args) {
    final String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    final String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "ten",
     "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    final int hundred = 7;
    final int and = 3;
    long sum = "onethousand".length();
    for (int i = 1; i < 20; i++) {
        if (i <= 9) sum += ones[i-1].length();
        else sum += tens[i-2].length();
    }
    for (int j = 20; j < 100; j++) {
        sum += tens[(j/10) - 2].length();
        if (j%10 != 0) sum += ones[(j%10) - 1].length();
    }
    for (int k = 100; k < 1000; k++) {
        sum += ones[(k/100) - 1].length() + hundred;
        if (((k%100) < 20) && (k%100) > 0) {
            if ((k%100) < 10) sum += and + ones[(k%100) - 1].length();
            else sum += and + tens[(k%100)-2].length();
        }
        else if ((k%100) > 0) {
            sum += and + tens[((k%100)/10)-2].length();
            if ((k%100)%10 > 0) sum += ones[(k%100)%10 - 1].length();
        }
    }
    System.out.println(sum);
}