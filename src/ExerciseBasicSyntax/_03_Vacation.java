package ExerciseBasicSyntax;

import java.util.Scanner;

public class _03_Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (groupType.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
            if (groupCount >= 30) {
                price = price - (price * 0.15);
            }

        } else if (groupType.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
            if (groupCount >= 100) {
                groupCount -= 10;
            }

        } else if (groupType.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
            if (groupCount >= 10 && groupCount <= 20) {
                price = price - (price * 0.05);
            }
        }

        double totalPrice = price * groupCount;
        System.out.printf("Total price: %.2f", totalPrice);


    }
}
