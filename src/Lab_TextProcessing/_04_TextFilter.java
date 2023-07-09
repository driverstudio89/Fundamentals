package Lab_TextProcessing;

import java.util.Scanner;

public class _04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWord = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : banWord) {
            String asterisk = "";
            for (int i = 0; i < word.length(); i++) {
                asterisk = asterisk + "*";
            }
            text = text.replace(word, asterisk);
        }

        System.out.println(text);
    }
}
