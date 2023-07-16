package Exercise_RegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> decryptedList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;
            StringBuilder decrypted = new StringBuilder();
            String encrypted = scanner.nextLine();
            for (char symbol : encrypted.toCharArray()) {
                symbol = Character.toLowerCase(symbol);
                if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                    count++;
                }
            }
            for (int j = 0; j < encrypted.length(); j++) {
                char symbol = encrypted.charAt(j);
                symbol = (char) (symbol - count);
                decrypted.append(symbol);
            }
            decryptedList.add(decrypted.toString());
        }

        List<String> attackedPlanetsList = new ArrayList<>();
        List<String> destroyedPlanetsList = new ArrayList<>();
        int attackedPlanetsCount = 0;
        int destroyedPlanetsCount = 0;


        for (String code : decryptedList) {
            String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(code);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");
                if (attackType.equals("A")) {
                    attackedPlanetsList.add(planetName);
                    attackedPlanetsCount++;
                } else if (attackType.equals("D")) {
                    destroyedPlanetsList.add(planetName);
                    destroyedPlanetsCount++;
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attackedPlanetsCount);
        Collections.sort(destroyedPlanetsList);
        Collections.sort(attackedPlanetsList);
        for (String planetName : attackedPlanetsList) {
            System.out.printf("-> %s%n", planetName);
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanetsCount);
        for (String planetName : destroyedPlanetsList) {
            System.out.printf("-> %s%n", planetName);
        }

    }

}

