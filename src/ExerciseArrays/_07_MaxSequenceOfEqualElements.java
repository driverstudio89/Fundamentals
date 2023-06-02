package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _07_MaxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int longestCounter = 0;
        int bestIndex = -1;

        for (int i = 0; i < sequence.length; i++) {
            int sequenceCounter = 1;
            int index = -1;
            for (int j = i + 1; j < sequence.length; j++) {
                if (sequence[i] == sequence[j]) {
                    sequenceCounter++;
                    index = i;
                    if (sequenceCounter > longestCounter) {
                        longestCounter = sequenceCounter;
                        bestIndex = index;
                    }
                } else {
                    break;
                }

            }

        }
        for (int i = 0; i < longestCounter; i++) {
            System.out.print(sequence[i + bestIndex] + " ");

        }

    }
}
