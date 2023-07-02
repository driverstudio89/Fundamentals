package MidExamPreparation;

import java.util.Scanner;

public class _03_01_ComputerStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            totalPrice += price;

            input = scanner.nextLine();
        }

        if (totalPrice <= 0) {
            System.out.println("Invalid order!");
            return;
        }


        double taxes = totalPrice * 0.2;
        double totalPriceWithTax = totalPrice + taxes;

        if (input.equals("special")) {
            totalPriceWithTax = totalPriceWithTax - totalPriceWithTax * 0.1;
        }

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalPrice);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", totalPriceWithTax);

    }
}
