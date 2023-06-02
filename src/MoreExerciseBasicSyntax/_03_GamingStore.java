package MoreExerciseBasicSyntax;

import java.util.Scanner;

public class _03_GamingStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double ballance = Double.parseDouble(scanner.nextLine());
        double totalSpend = 0;

        String input = scanner.nextLine();
        while (!input.equals("Game Time")){

            if (input.equals("OutFall 4")){
                if (ballance < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += 39.99;
                    ballance -= 39.99;
                    System.out.println("Bought OutFall 4");
                }
            }else if (input.equals("CS: OG")){
                if (ballance < 15.99) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += 15.99;
                    ballance -= 15.99;
                    System.out.println("Bought CS: OG");
                }
            }else if (input.equals("Zplinter Zell")){
                if (ballance < 19.99) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += 19.99;
                    ballance -= 19.99;
                    System.out.println("Bought Zplinter Zell");
                }
            }else if (input.equals("Honored 2")){
                if (ballance < 59.99) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += 59.99;
                    ballance -= 59.99;
                    System.out.println("Bought Honored 2");
                }
            }else if (input.equals("RoverWatch")){
                if (ballance < 29.99) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += 29.99;
                    ballance -= 29.99;
                    System.out.println("Bought RoverWatch");
                }
            }else if (input.equals("RoverWatch Origins Edition")){
                if (ballance < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += 39.99;
                    ballance -= 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            } else {
                System.out.println("Not Found");
            }

            if (ballance <= 0) {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }

        if (ballance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, ballance);
        }
    }
}
