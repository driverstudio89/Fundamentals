package ExerciseBasicSyntax;

import java.util.Scanner;

public class _07_VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumOfCoins = 0;
        double price = 0;
        boolean isNotValid = false;


        while (!input.equals("Start")) {
            double currentCoin = Double.parseDouble(input);
            if (currentCoin == 0.1 || currentCoin == 0.2 || currentCoin == 0.5 || currentCoin == 1.0 || currentCoin == 2.0) {
                sumOfCoins += currentCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    isNotValid = true;
                    System.out.println("Invalid product");
                    break;
            }
            if (price > sumOfCoins) {
                System.out.println("Sorry, not enough money");
            } else if (!isNotValid){
                sumOfCoins -= price;
                System.out.printf("Purchased %s%n", input);
            }

            input = scanner.nextLine();

        }
        System.out.printf("Change: %.2f%n", sumOfCoins);

    }
}
