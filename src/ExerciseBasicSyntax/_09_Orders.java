package ExerciseBasicSyntax;

import java.util.Scanner;

public class _09_Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());

        double total = 0;

        for (int order = 1; order <= ordersCount; order++) {

            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double price = ((days * capsuleCount) * capsulePrice);
            System.out.printf("The price for the coffee is: $%.2f%n", price);
            total += price;
        }

        System.out.printf("Total: $%.2f%n", total);

    }
}
