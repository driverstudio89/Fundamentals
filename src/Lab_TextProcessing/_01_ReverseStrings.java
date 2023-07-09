package Lab_TextProcessing;

import java.util.Scanner;

public class _01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder word = new StringBuilder();
            for (int i = input.length() - 1; i >=0 ; i--) {
                char currentChar = input.charAt(i);
                word.append(currentChar);
            }

            System.out.println(input + " = " + word);
            input = scanner.nextLine();
        }

    }
}
