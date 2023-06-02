package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _09_SpiceMustFlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int dailyYield = startYield;
        int dayCounter = 0;
        int extracted = 0;

        while (dailyYield >= 100){
            extracted += dailyYield - 26;
            dailyYield -= 10;
            dayCounter++;
        }
        if (extracted >= 26) {
            extracted -= 26;
        }
        System.out.println(dayCounter);
        System.out.println(extracted);
    }
}
