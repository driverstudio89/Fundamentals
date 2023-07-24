package _01_ExamPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> rarityMap = new LinkedHashMap<>();
        Map<String, Double> ratingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            rarityMap.put(plant, rarity);
            ratingMap.put(plant, 0.0);
        }
        String ratingInput = scanner.nextLine();

        while (!ratingInput.equals("Exhibition")) {
            String command = ratingInput.split("[: -]+")[0];
            String plant = ratingInput.split("[: -]+")[1];

            boolean isValid = command.equals("Rate") || command.equals("Update") || command.equals("Reset");

            if (!isValid || !rarityMap.containsKey(plant)) {
                System.out.println("error");

            } else {
                switch (command) {
                    case "Rate":
                        double rating = Double.parseDouble(ratingInput.split("[: -]+")[2]);
                        if (ratingMap.get(plant) == 0) {
                            ratingMap.put(plant, rating);
                        } else {
                            double newRating = (ratingMap.get(plant) + rating) / 2;
                            ratingMap.put(plant, newRating);
                        }

                        break;

                    case "Update":
                        int newRarity = Integer.parseInt(ratingInput.split("[: -]+")[2]);
                        rarityMap.put(plant, newRarity);
                        break;

                    case "Reset":
                        ratingMap.put(plant, 0.0);
                        break;
                }
            }
            ratingInput = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        rarityMap.entrySet().forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), ratingMap.get(entry.getKey())));
    }
}
