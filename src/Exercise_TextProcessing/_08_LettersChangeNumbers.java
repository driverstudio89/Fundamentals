package Exercise_TextProcessing;

import java.util.Scanner;

public class _08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double result = 0;

        for (String code : input) {
            result += resolveCode(code);
        }
        System.out.printf("%.2f", result);
    }

    private static double resolveCode(String code) {
        double result = 0;
        char firstSymbol = code.charAt(0);
        double num = Double.parseDouble(code.substring(1, code.length() - 1));
        char lastSymbol = code.charAt(code.length() - 1);

        if (Character.isUpperCase(firstSymbol)) {
            int firstSymbolPosition = (int) firstSymbol - 64;
            result = num / firstSymbolPosition;

        } else {
            int firstSymbolPosition = (int) firstSymbol - 96;
            result = num * firstSymbolPosition;
        }

        if (Character.isUpperCase(lastSymbol)) {
            int lastSymbolPosition = (int) lastSymbol - 64;
            result = result - lastSymbolPosition;

        } else {
            int lastSymbolPosition = (int) lastSymbol - 96;
            result = result + lastSymbolPosition;
        }

        return result;
    }
}
