package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class _03_02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());

        int[] liftArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int spaceLeft = 0;
        for (int i = 0; i < liftArr.length; i++) {
            spaceLeft += (4 - liftArr[i]);
        }


        while (waitingPeople > 0 && spaceLeft > 0) {
            for (int i = 0; i < liftArr.length; i++) {
                if (liftArr[i] < 4) {
                    int placesLeft = 4 - liftArr[i];
                    for (int j = 0; j < placesLeft; j++) {
                        liftArr[i]++;
                        waitingPeople--;
                        spaceLeft--;
                        if (spaceLeft == 0) {
                            break;
                        }
                        if (waitingPeople == 0) {
                            break;
                        }
                    }
                }

            }

        }
        if (spaceLeft > 0 && waitingPeople == 0) {
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(liftArr).replaceAll("[\\[\\],]", ""));
        } else if (spaceLeft == 0 && waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            System.out.println(Arrays.toString(liftArr).replaceAll("[\\[\\],]", ""));
        } else if (spaceLeft == 0 && waitingPeople == 0) {
            System.out.println(Arrays.toString(liftArr).replaceAll("[\\[\\],]", ""));
        }

    }
}
