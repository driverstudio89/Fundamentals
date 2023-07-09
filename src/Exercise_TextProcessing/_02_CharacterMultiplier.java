package Exercise_TextProcessing;

import java.util.Scanner;

public class _02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String firstString = input.split(" ")[0];
        String secondString = input.split(" ")[1];

        int sum = 0;

        if (firstString.length() >= secondString.length()) {
            for (int i = 0; i < secondString.length(); i++) {
                int firstCharAsNum = firstString.charAt(i);
                int secondCharAsNum = secondString.charAt(i);
                sum += firstCharAsNum * secondCharAsNum;
            }
            for (int i = secondString.length(); i < firstString.length(); i++) {
                int firstCharAsNum = firstString.charAt(i);
                sum += firstCharAsNum;
            }
        }
        if (secondString.length() > firstString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                int firstCharAsNum = firstString.charAt(i);
                int secondCharAsNum = secondString.charAt(i);
                sum += firstCharAsNum * secondCharAsNum;
            }
            for (int i = firstString.length(); i < secondString.length(); i++) {
                int secondCharAsNum = secondString.charAt(i);
                sum += secondCharAsNum;
            }
        }

        System.out.println(sum);

    }
}
