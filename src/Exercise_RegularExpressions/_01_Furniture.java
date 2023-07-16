package Exercise_RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        List<String> furnitureList = new ArrayList<>();
        double totalPrice = 0;

        String input = scanner.nextLine();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furniture);
                double currentPrice = price * quantity;
                totalPrice += currentPrice;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furniture : furnitureList) {
            System.out.println(furniture);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
