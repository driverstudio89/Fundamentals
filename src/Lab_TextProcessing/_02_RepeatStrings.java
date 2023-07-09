package Lab_TextProcessing;

import java.util.Scanner;

public class _02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        StringBuilder concatString = new StringBuilder();

        for (String word : input) {
            for (int i = 0; i < word.length(); i++) {
                concatString.append(word);
            }
        }
        System.out.println(concatString);
    }
}
