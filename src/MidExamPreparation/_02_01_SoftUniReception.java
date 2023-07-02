package MidExamPreparation;

import java.util.Scanner;

public class _02_01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int totalStudentsPerHour = firstEmployee + secondEmployee + thirdEmployee;
        int hours = 0;
        int hourCounter = 0;

        while (studentCount > 0) {
            hours++;
            if (hours % 4 != 0) {
                studentCount -= totalStudentsPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
