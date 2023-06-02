package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int indexDiff = -1;
        int sumArr = 0;
        for (int i = 0; i < firstArray.length; i++) {
            int currentNumFirstArr = firstArray[i];
            int currentNumSecondArr = secondArray[i];
            if (currentNumFirstArr == currentNumSecondArr) {
                sumArr += currentNumFirstArr;
            } else {
                indexDiff = i;
                break;
            }
        }
        if (indexDiff == -1) {
            System.out.printf("Arrays are identical. Sum: %d", sumArr);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexDiff);
        }

    }
}
