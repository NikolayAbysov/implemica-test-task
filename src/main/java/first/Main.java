package first;

import java.util.Scanner;

/**
 * Catalan sequence of numbers solves the issue of finding the number of parentheses for some N.
 * countCatalanNumber(int n) method is used for recursive count.
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide number of parentheses pairs to count:\n");
        int input = scanner.nextInt();
        System.out.println("Possible number of expressions is: " + countCatalanNumber(input));
    }

    private static int countCatalanNumber(int n) {
        int result = 0;
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            result += countCatalanNumber(i) * countCatalanNumber(n - i - 1);
        }
        return result;
    }
}
