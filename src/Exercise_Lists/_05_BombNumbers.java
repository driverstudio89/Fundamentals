package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String explosive = scanner.nextLine();
        int bomb = Integer.parseInt(explosive.split(" ")[0]);
        int power = Integer.parseInt(explosive.split(" ")[1]);
        int sum = 0;

        while (numbersList.contains(bomb)){
            int currentNum = numbersList.indexOf(bomb);

                int left = Math.max(0, currentNum - power);
                int right = Math.min(currentNum + power, numbersList.size() - 1);

                for (int j = right; j >= left; j--) {
                    numbersList.remove(j);
                }

        }
        for (int num : numbersList) {
            sum += num;
        }
        System.out.println(sum);

    }
}
