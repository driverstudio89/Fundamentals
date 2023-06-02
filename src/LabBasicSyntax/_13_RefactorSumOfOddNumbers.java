package LabBasicSyntax;

import java.util.Scanner;

public class _13_RefactorSumOfOddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int result = 2 * i + 1;
            System.out.println(result);
            sum += result;
        }
        System.out.printf("Sum: %d%n", sum);



    }
}
