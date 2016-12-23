//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public static void main(String[] args) {
    boolean found = false;
    double a = 3;
    double b = 4;
    double c = 5;
    while (!found) {
        while ((a + b + c) < 1000) {
            b++;
            c = Math.pow((a*a+b*b), 0.5);
        }
        if ((a + b + c) == 1000) found = true;
        else {
            a++;
            b = a + 1;
            c = Math.pow((a*a+b*b), 0.5);
        }
    }
    System.out.println((int)(a*b*c));
}