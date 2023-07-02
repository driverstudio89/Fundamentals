package Lab_MapsLambdaandStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> countsMap = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase();

            countsMap.putIfAbsent(currentWord, 0);
            countsMap.put(currentWord, countsMap.get(currentWord) + 1);
        }

        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", resultList));

    }
}
