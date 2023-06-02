package ExerciseArrays;

import java.util.Scanner;

public class _01_Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;

        int[] peopleArr = new int[n];

        for (int i = 0; i < n ; i++) {
            peopleArr[i] = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleArr[i];
        }
        for (int i = 0; i < peopleArr.length; i++) {
            System.out.print(peopleArr[i] + " ");
        }
        System.out.println();
        System.out.println(totalPeople);
    }
}
