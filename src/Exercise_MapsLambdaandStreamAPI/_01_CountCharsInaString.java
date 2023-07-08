package Exercise_MapsLambdaandStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputArr = scanner.nextLine().replaceAll(" ","");

        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for (char symbol : inputArr.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (charMap.containsKey(symbol)) {
                int currentCount = charMap.get(symbol);
                charMap.put(symbol, currentCount + 1);
            } else {
                charMap.put(symbol, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
