package ExercisesMethods;

import java.util.Scanner;

public class _03_CharactersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printCharacterBetween(firstChar, secondChar);


    }

    public static void printCharacterBetween(char char1, char char2) {
        if (char1 < char2) {
            for (char i = (char) (char1 + 1); i < char2; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (char i = (char) (char2 + 1); i < char1; i++){
                System.out.print(i + " ");
            }
        }


    }
}
