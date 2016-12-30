//How many lattice paths in a 20x20 grid?

public static void main(String[] args) {
    double numFactorial = 1;
    for (int i = 21; i <= 40; i++) {
        numFactorial *= i;
        numFactorial /= (41-i);
    }
    System.out.println((long)numFactorial+1);
}