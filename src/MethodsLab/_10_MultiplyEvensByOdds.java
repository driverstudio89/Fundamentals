package MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class _10_MultiplyEvensByOdds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = getMultiplyEvenAndOdd(num);
        System.out.println(result);


    }

    public static int getMultiplyEvenAndOdd(int num) {
        return evenSum(num) * oddSum(num);
    }

    public static int evenSum(int num) {
        String intToString = Integer.toString(num);
        int sum = 0;
        int[] numArr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                sum += numArr[i];
            }
        }
        return sum;
    }

    public static int oddSum(int num) {
        String intToString = Integer.toString(num);
        int sum = 0;
        int[] numArr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 != 0) {
                sum += numArr[i];
            }
        }
        return sum;
    }
}
