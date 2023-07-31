package FinalExam;

import java.util.Scanner;

public class _01_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        String instructions = scanner.nextLine();

        while (!instructions.contains("Finish")) {
            String command = instructions.split(" ")[0];

            switch (command) {
                case "Replace":
                    String currentChar = instructions.split(" ")[1];
                    String newChar = instructions.split(" ")[2];
                    encryptedMessage = encryptedMessage.replace(currentChar, newChar);
                    System.out.println(encryptedMessage);
                    break;

                case "Cut":
                    int startIndex = Integer.parseInt(instructions.split(" ")[1]);
                    int endIndex = Integer.parseInt(instructions.split(" ")[2]);
                    if (isValid(startIndex, encryptedMessage) && isValid(endIndex, encryptedMessage)) {
                        String substring = encryptedMessage.substring(startIndex, endIndex + 1);
                        encryptedMessage = encryptedMessage.replace(substring, "");
                        System.out.println(encryptedMessage);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;

                case "Make":
                    String upperOrLower = instructions.split(" ")[1];
                    if (upperOrLower.equals("Upper")) {
                        encryptedMessage = encryptedMessage.toUpperCase();
                    } else if (upperOrLower.equals("Lower")) {
                        encryptedMessage = encryptedMessage.toLowerCase();
                    }
                    System.out.println(encryptedMessage);
                    break;

                case "Check":
                    String substring = instructions.split(" ")[1];
                    if (encryptedMessage.contains(substring)) {
                        System.out.printf("Message contains %s%n", substring);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", substring);
                    }
                    break;

                case "Sum":
                    int sum = 0;
                    int sumStartIndex = Integer.parseInt(instructions.split(" ")[1]);
                    int sumEndIndex = Integer.parseInt(instructions.split(" ")[2]);
                    if (isValid(sumStartIndex, encryptedMessage) && isValid(sumEndIndex, encryptedMessage)) {
                        String sumSubstring = encryptedMessage.substring(sumStartIndex, sumEndIndex + 1);
                        for (int i = 0; i < sumSubstring.length(); i++) {
                            sum += sumSubstring.charAt(i);
                        }
                        System.out.println(sum);

                    } else {
                        System.out.println("Invalid indices!");
                    }

                    break;
            }

            instructions = scanner.nextLine();
        }

    }
    public static boolean isValid(int index, String text) {
        return index >-1 && index < text.length();
    }
}
