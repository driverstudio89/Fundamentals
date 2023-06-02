package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _10_PokeMon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startPower = Integer.parseInt(scanner.nextLine());
        int power = startPower;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (power >= distance) {
            power -= distance;
            counter++;
            if (power == startPower / 2 && exhaustionFactor != 0) {
                power = power / exhaustionFactor;
            }
        }
        System.out.println(power);
        System.out.println(counter);

    }
}
