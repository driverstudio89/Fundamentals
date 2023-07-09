package Exercise_TextProcessing;

import java.util.Scanner;

public class _03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String file = input[input.length - 1];

        String name = file.split("\\.")[0];
        String extension = file.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);

    }
}
