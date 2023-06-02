package LabArrays;

import java.util.Scanner;

public class _04_ReverseAnArrayOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String currentElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = currentElement;
        }

        System.out.println(String.join(" ", inputArr));

    }
}
