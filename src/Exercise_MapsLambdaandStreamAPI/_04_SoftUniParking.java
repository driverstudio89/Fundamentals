package Exercise_MapsLambdaandStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String command = input.split(" ")[0];
            String username = input.split(" ")[1];

            switch (command) {
                case "register":
                    String plateNumber = input.split(" ")[2];
                    if (!parkingMap.containsKey(username)) {
                        parkingMap.put(username, plateNumber);
                        System.out.printf("%s registered %s successfully%n", username, plateNumber);
                    } else {
                        System.out.println("ERROR: already registered with plate number " + plateNumber);
                    }
                    break;
                case "unregister":
                    if (parkingMap.containsKey(username)) {
                        parkingMap.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }

        }

        for (Map.Entry<String, String> entry : parkingMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
