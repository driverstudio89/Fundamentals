package Exercise_TextProcessing;

import java.util.Scanner;

public class _06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder simplifyText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (i == 0) {
                simplifyText.append(currentSymbol);
                continue;
            }
            char previousSymbol = input.charAt(i - 1);

            if (currentSymbol == previousSymbol) {
                continue;
            }
                simplifyText.append(currentSymbol);
        }
        System.out.println(simplifyText);

    }
}
