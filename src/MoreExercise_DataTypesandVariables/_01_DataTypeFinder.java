package MoreExercise_DataTypesandVariables;

import java.util.Scanner;

public class _01_DataTypeFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            try {
                int isInteger = Integer.parseInt(input);
                System.out.printf("%d is integer type%n", isInteger);
            } catch (Exception e) {
                try {
                    double isDouble = Double.parseDouble(input);
                    System.out.printf("%.1f is floating point type%n", isDouble);
                } catch (Exception f) {
                    if (input.length() == 1) {
                        char isChar = input.charAt(0);
                        System.out.printf("%c is character type%n", isChar);
                    } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
                            System.out.printf("%s is boolean type%n", input);
                        } else {
                            System.out.printf("%s is string type%n", input);
                        }
                    }
                }

            input = scanner.nextLine();
        }

    }
}

