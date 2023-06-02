package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _11_Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfBalls = Integer.parseInt(scanner.nextLine());
        double bestValue = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 1; i <= numberOfBalls ; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > bestValue) {
                bestValue = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
