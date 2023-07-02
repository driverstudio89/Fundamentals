package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_GaussTrick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int listSize = numbersList.size();

        for (int i = 0; i < listSize / 2; i++) {
            int currentNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size()-1);
            int sum = currentNum + lastNum;
            numbersList.set(i, sum);
            numbersList.remove(numbersList.size()-1);
        }
        for (int num : numbersList) {
            System.out.print(num + " ");
        }
    }
}
