package LabObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class _01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            int index = rnd.nextInt(input.length);
            input[i] = input[index];
            input[index] = currentWord;
        }

        for (String word : input) {
            System.out.println(word);
        }
    }
}
