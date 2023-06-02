package LabArrays;

import java.util.Scanner;

public class _02_PrintNumbersInReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numArr =  new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = n-1; i >=0 ; i--) {
            System.out.printf("%d ", numArr[i]);

        }

    }
}
