package Exercise_TextProcessing;

import java.util.Scanner;

public class _04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder encryptedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int currentChar = input.charAt(i);
            int encryptedChar = currentChar + 3;
            encryptedString.append((char) encryptedChar);
        }

        System.out.println(encryptedString);
    }
}
