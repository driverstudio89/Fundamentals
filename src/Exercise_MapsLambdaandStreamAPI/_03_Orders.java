package Exercise_MapsLambdaandStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> productQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String name = input.split(" ")[0];
            int quantity = Integer.parseInt(input.split(" ")[2]);
            double price = Double.parseDouble(input.split(" ")[1]);

            if (!productQuantity.containsKey(name)) {
                productQuantity.put(name, quantity);
            } else {
                int currentQuantity = productQuantity.get(name);
                productQuantity.put(name, currentQuantity + quantity);
            }

            productPrice.put(name, price);


            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            String productName = entry.getKey();
            double finalPrice = productQuantity.get(productName) * productPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalPrice);
        }


    }

}
