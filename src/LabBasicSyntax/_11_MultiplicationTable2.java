package LabBasicSyntax;

import java.util.Scanner;

public class _11_MultiplicationTable2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            int result = num * multiplier;
            System.out.printf("%d X %d = %d%n", num, multiplier, result);
        } else {
            for (int i = multiplier; i <= 10; i++) {
                int result = num * i;
                System.out.printf("%d X %d = %d%n", num, i, result);
            }
        }

    }
}
