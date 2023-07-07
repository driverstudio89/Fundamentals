package Exercise_MapsLambdaandStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                        int currentQuantity = materialsMap.get(material);
                        materialsMap.put(material, currentQuantity + quantity);
                } else {
                    if (junkMap.containsKey(material)) {
                        int currentQuantity = junkMap.get(material);
                        junkMap.put(material, currentQuantity + quantity);
                    } else {
                        junkMap.put(material, quantity);
                    }
                }

                if (materialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materialsMap.put("shards", materialsMap.get("shards") - 250);
                    isWin = true;
                    break;
                }else if (materialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialsMap.put("fragments", materialsMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialsMap.put("motes", materialsMap.get("motes") - 250);
                    isWin = true;
                    break;
                }

            }
            if (isWin) {
                break;
            }
        }

        materialsMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

    }
}
