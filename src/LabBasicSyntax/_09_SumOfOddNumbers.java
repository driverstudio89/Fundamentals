package LabBasicSyntax;

import java.util.Scanner;

public class _09_SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int num = 1; num <= n * 2; num+= 2) {

            System.out.println(num);
            sum += num;

        }
        System.out.println("Sum: " + sum);
    }
}
