package LabBasicSyntax;

import java.util.Scanner;

public class _08_DivisibleBy3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int num = 3; num <= 100; num += 3) {
            System.out.println(num);
        }
    }
}
