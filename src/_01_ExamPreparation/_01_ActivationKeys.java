package _01_ExamPreparation;

import java.util.Scanner;

public class _01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String command = input.split(">>>")[0];
            String substring = "";
            int startIndex = -1;
            int endIndex = -1;
            switch (command) {
                case "Contains":
                    substring = input.split(">>>")[1];
                    if (rawKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", rawKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String instruction = input.split(">>>")[1];
                    startIndex = Integer.parseInt(input.split(">>>")[2]);
                    endIndex = Integer.parseInt(input.split(">>>")[3]);

                    if (instruction.equals("Upper")) {
                        substring = rawKey.substring(startIndex, endIndex);
                        rawKey = rawKey.replace(substring, substring.toUpperCase());
                        System.out.println(rawKey);
                    } else if (instruction.equals("Lower")) {
                        substring = rawKey.substring(startIndex, endIndex);
                        rawKey = rawKey.replace(substring, substring.toLowerCase());
                        System.out.println(rawKey);
                    }
                    break;

                case "Slice":
                    startIndex = Integer.parseInt(input.split(">>>")[1]);
                    endIndex = Integer.parseInt(input.split(">>>")[2]);
                    substring = rawKey.substring(startIndex, endIndex);
                    rawKey = rawKey.replace(substring, "");
                    System.out.println(rawKey);
            }

            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + rawKey);
    }
}
