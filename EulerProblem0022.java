import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public static void main(String[] args) {
    String content = null;
    try {
        content = new Scanner(new File("p022_names.txt")).useDelimiter("\\Z").next();
    } catch (FileNotFoundException fnfe) {
        System.out.println(fnfe.getMessage());
    }
    String substring = content.substring(1, (content.length())-1);
    String[] names = substring.split("\",\"");
    String[] sorted = mergeSort(names);
    long sum = 0;
    for (int i = 1; i <= sorted.length; i++) {
        sum += getScore(sorted[i-1])*i;
    }
    System.out.println(sum);
}

public static String[] mergeSort(String[] arr) {
    if (arr.length == 1) return arr;
    String[] a = mergeSort(Arrays.copyOfRange(arr, 0, arr.length/2));
    String[] b = mergeSort(Arrays.copyOfRange(arr, arr.length/2, arr.length));
    return merge(a, b);
}

public static String[] merge(String[] A, String[] B) {
    String[] arr = new String[A.length + B.length];
    int a = 0;
    int b = 0;
    int i = 0;
    while ((a < A.length) || (b < B.length)) {
        if (a == A.length) {
            arr[i] = B[b];
            b++;
        }
        else if ((b == B.length) || precedes(A[a], B[b])) {
            arr[i] = A[a];
            a++;
        }
        else {
            arr[i] = B[b];
            b++;
        }
        i++;
    }
    return arr;
}

public static boolean precedes(String a, String b) {
    char[] first = a.toCharArray();
    char[] second = b.toCharArray();
    int i = 0;
    while ((i < first.length) || (i < second.length)) {
        if (i == first.length) return true;
        else if (i == second.length) return false;
        else if (first[i] < second[i]) return true;
        else if (second[i] < first[i]) return false;
        else i++;
    }
    return false;
}

public static long getScore(String name) {
    char[] letters = name.toCharArray();
    long sum = 0;
    for (int i = 0; i < letters.length; i++) {
        sum += Character.getNumericValue(letters[i]) - 9;
    }
    return sum;
}