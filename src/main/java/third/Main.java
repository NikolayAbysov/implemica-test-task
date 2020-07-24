package third;

import java.util.Scanner;

/**
 * Simple recursive factorialCount(int number) method returns the factorial of passed number
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide number to factorial count:\n");
        int input = scanner.nextInt();
        System.out.println("Factorial count equals: " + factorialCount(input));
    }

    private static int factorialCount(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 1;
        }
        return number * factorialCount(number - 1);
    }
}
