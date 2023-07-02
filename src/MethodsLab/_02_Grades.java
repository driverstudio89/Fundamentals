package MethodsLab;

import java.util.Scanner;

public class _02_Grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inputGrade = Double.parseDouble(scanner.nextLine());

        gradeInWords(inputGrade);
    }

    public static void gradeInWords(double grade) {
        String word = "";
        if (grade >= 2.00 && grade <= 2.99) {
            word = "Fail";
        } else if (grade >= 3.00 && grade <= 3.49) {
            word = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            word = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            word = "Very good";
        } else if (grade >= 5.50 && grade <= 6.00) {
            word = "Excellent";
        }
        System.out.println(word);
    }
}
