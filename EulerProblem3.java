//What is the largest prime factor of the number 600851475143?

public static void main(String[] args) {
    HashSet<Integer> factors = new HashSet<>();
    long number = 600851475143L;
    int max = (int)Math.ceil(Math.pow(number, 0.5));
    int lastElement = -1;
    for (int i = 2; i < max; i++) {
        if (number%i == 0) {
            Iterator<Integer> it = factors.iterator();
            boolean multiple = false;
            while (it.hasNext() && !multiple) {
                if (i%it.next() == 0) multiple = true;
            }
            if (!multiple) {
                factors.add(i);
                lastElement = i;
            }
        }
    }
    System.out.println(lastElement);
}