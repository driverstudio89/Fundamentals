package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _08_MagicSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                int element1 = numbersArray[i];
                int element2 = numbersArray[j];
                if (element1 + element2 == magicNumber) {
                    System.out.println(element1 + " " + element2);
                }
            }
        }
    }
}
