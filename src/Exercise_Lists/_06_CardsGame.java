package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstDeck.size() != 0 && secondDeck.size() != 0) {
            int firstPlayerCard = firstDeck.get(0);
            int secondPlayerCard = secondDeck.get(0);
            firstDeck.remove(0);
            secondDeck.remove(0);
            if (firstPlayerCard > secondPlayerCard) {
                firstDeck.add(firstPlayerCard);
                firstDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondDeck.add(secondPlayerCard);
                secondDeck.add(firstPlayerCard);
            }
        }

        if (firstDeck.size() == 0) {
            int sum = 0;
            for (int card : secondDeck) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else if (secondDeck.size() == 0) {
            int sum = 0;
            for (int card : firstDeck) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
