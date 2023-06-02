package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _03_SumEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//
//        String[] inputArr = input.split(" ");

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();



    }
}
