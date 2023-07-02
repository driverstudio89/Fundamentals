package ExercisesMethods;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        topNumber(n);
    }

    public static void topNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (divisibleBy8(i) && holdsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean divisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean holdsOddDigit(int number) {
        boolean isOdd = false;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                isOdd = true;
                break;
            }
            number = number / 10;
        }
        return isOdd;
    }
}
