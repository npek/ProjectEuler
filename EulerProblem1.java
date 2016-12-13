public static void main(String[] args) {
    Integer count = 1;
    Integer sum = 0;
    while (count*3 < 1000) {
        sum += count*3;
        count++;
    }
    count = 1;
    while (count*5 < 1000) {
        if ((count*5)%3 == 0) sum += count*5;
        count++;
    }
    System.out.println(sum);
}