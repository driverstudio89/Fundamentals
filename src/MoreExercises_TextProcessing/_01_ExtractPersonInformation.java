package MoreExercises_TextProcessing;

import java.util.Scanner;

public class _01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = "";
            int age = -1;
            for (String word : input) {
                if (word.contains("@")) {
                    name = word.replace("@", "").replace("|", "");
                } else if (word.contains("#")) {
                    age = Integer.parseInt(word.replace("#", "").replace("*", ""));
                }
            }
            System.out.printf("%s is %d years old.%n", name, age);
        }

    }
}
