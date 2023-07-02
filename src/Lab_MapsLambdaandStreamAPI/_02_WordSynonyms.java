package Lab_MapsLambdaandStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymsMap.containsKey(word)) {
                synonymsMap.put(word, new ArrayList<>());
            }

            synonymsMap.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : synonymsMap.entrySet()) {
            String keyMap = entry.getKey();
            ArrayList<String> synonymsList = entry.getValue();

            System.out.printf("%s - %s%n", keyMap, String.join(", ", synonymsList));
        }
    }
}
