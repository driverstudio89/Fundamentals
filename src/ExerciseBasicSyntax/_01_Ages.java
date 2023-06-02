package ExerciseBasicSyntax;

import java.util.Scanner;

public class _01_Ages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String personIs = "";

        if (age >=0 && age <= 2){
            personIs = "baby";
        } else if (age <= 13) {
            personIs = "child";
        } else if (age <= 19) {
            personIs = "teenager";
        } else if (age <= 65) {
            personIs = "adult";
        } else if (age >65) {
            personIs = "elder";
        }
        System.out.println(personIs);

    }

}
