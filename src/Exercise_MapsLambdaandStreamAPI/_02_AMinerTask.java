package Exercise_MapsLambdaandStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String currentResourceName = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resourcesMap.containsKey(currentResourceName)) {
                int currentQuantity = resourcesMap.get(currentResourceName);
                resourcesMap.put(currentResourceName, currentQuantity + quantity);
            } else {
                resourcesMap.put(currentResourceName, quantity);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
