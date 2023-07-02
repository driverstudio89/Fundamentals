package MidExamPreparation;

import java.util.Scanner;

public class _1_1_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        int maxAttendance = 0;
        double maxBonus = 0;

        for (int i = 1; i <= studentsCount; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = studentAttendance * 1.0 / lecturesCount * (5 + (initialBonus));
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendance = studentAttendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.", Math.ceil(maxBonus), maxAttendance);

    }
}
