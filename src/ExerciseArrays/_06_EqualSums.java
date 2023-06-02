package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int equalIndex = -1;
        boolean isNotEqual = true;

        for (int currentIndex = 0; currentIndex < numbersArray.length; currentIndex++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < currentIndex; i++) {
                leftSum += numbersArray[i];
            }
            for (int i = currentIndex + 1; i < numbersArray.length; i++) {
                rightSum += numbersArray[i];
            }
            if (leftSum == rightSum) {
                equalIndex = currentIndex;
                isNotEqual = false;
                break;
            }

        }
        if (isNotEqual) {
            System.out.println("no");
        } else {
            System.out.println(equalIndex);
        }
    }
}
