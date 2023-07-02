package MidExam_18June2023;

import java.util.Scanner;

public class _01_ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());
        int battleCount = Integer.parseInt(scanner.nextLine());

        double totalExperience = 0;
        int counter = 0;

        for (int i = 1; i <= battleCount; i++) {
            double experience = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0) {
                experience += experience * 0.15;
            }
            if (i % 5 == 0) {
                experience -= experience * 0.10;
            }
            if (i % 15 == 0) {
                experience += experience * 0.05;
            }
            totalExperience += experience;
            counter++;
            if (totalExperience >= neededExperience) {
                break;
            }
        }
        if (totalExperience >= neededExperience) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", counter);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience - totalExperience);
        }
    }
}
