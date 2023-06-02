package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numberArray.length; i++) {
            boolean isTop = true;
            int currentNumber = numberArray[i];
            for (int j = i + 1; j < numberArray.length; j++) {
                int rightNumber = numberArray[j];
                if (currentNumber <= rightNumber) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNumber + " ");
            }

        }
    }
}
