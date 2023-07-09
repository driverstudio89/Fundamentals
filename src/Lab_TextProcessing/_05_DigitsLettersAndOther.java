package Lab_TextProcessing;

import java.util.Scanner;

public class _05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (char currentChar : input.toCharArray()) {
            if (Character.isDigit(currentChar)) {
                digits.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            }else {
                other.append(currentChar);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}
