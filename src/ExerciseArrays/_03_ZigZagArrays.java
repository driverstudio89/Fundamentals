package ExerciseArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _03_ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                firstArr[i] = currentRow[0];
                secondArr[i] = currentRow[1];
            } else {
                firstArr[i] = currentRow[1];
                secondArr[i] = currentRow[0];
            }
        }
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }

    }
}
