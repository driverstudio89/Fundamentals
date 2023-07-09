package Exercise_TextProcessing;

import java.util.Scanner;

public class _07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder finalText = new StringBuilder(input);

        int totalPower = 0;

        for (int i = 0; i < finalText.length(); i++) {
            char currentChar = finalText.charAt(i);
            if (currentChar == '>') {
                int power = Integer.parseInt(String.valueOf(finalText.charAt(i + 1)));
                totalPower += power;

            } else if (totalPower > 0) {
                finalText.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(finalText);
    }
}
