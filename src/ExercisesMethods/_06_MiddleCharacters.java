package ExercisesMethods;

import java.util.Scanner;

public class _06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleCharacter(input);
    }

    public static void middleCharacter(String text) {
        if (text.length() % 2 == 0) {
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));
        } else {

            System.out.print(text.charAt(text.length() / 2));
        }
    }
}
