package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            int firstElement = numberArray[0];
            for (int j = 0; j < numberArray.length - 1; j++) {
                numberArray[j] = numberArray[j + 1];
            }
            numberArray[numberArray.length - 1] = firstElement;
        }
        for (int element : numberArray) {
            System.out.print(element + " ");
        }
    }
}
