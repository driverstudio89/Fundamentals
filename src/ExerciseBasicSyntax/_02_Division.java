package ExerciseBasicSyntax;

import java.util.Scanner;

public class _02_Division {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());

        if (integer % 10 == 0){
            System.out.printf("The number is divisible by 10");
        } else if (integer % 7 == 0) {
            System.out.printf("The number is divisible by 7");
        } else if (integer % 6 == 0) {
            System.out.printf("The number is divisible by 6");
        } else if (integer % 3 == 0) {
            System.out.printf("The number is divisible by 3");
        } else if (integer % 2 == 0) {
            System.out.printf("The number is divisible by 2");
        }else {
            System.out.println("Not divisible");
        }

    }
}
