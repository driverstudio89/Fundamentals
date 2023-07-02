package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class _1_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        int size = sequenceList.size();

        for (int number : sequenceList) {
            sum += number;
        }

        double avgValue = sum * 1.0 / size;
        List<Integer> topList = new ArrayList<>();

        for (int i = 0; i < sequenceList.size(); i++) {
            if (sequenceList.get(i) > avgValue) {
                int topNumber = sequenceList.get(i);
                topList.add(topNumber);
            }
        }

        if (topList.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(topList);
            Collections.reverse(topList);
            int end = Math.min(topList.size(), 5);
            for (int i = 0; i < end; i++) {
                System.out.print(topList.get(i) + " ");
            }
        }
    }
}
