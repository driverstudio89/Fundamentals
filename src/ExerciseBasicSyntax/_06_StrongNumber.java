package ExerciseBasicSyntax;

import java.util.Scanner;

public class _06_StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int startNum = num;
        int sumFact = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            sumFact += factorial;

            num = num / 10;
        }
        if (sumFact == startNum) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
