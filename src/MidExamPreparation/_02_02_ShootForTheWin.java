package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_02_ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int shotTargetCount = 0;

        while (!input.equals("End")){
            int indexToShoot = Integer.parseInt(input);
            if (indexToShoot >= 0 && indexToShoot < targetsList.size() && targetsList.get(indexToShoot) >= 0){
                shotTargetCount++;
                int shotTarget = targetsList.get(indexToShoot);
                for (int i = 0; i < targetsList.size(); i++) {
                    int currentTarget = targetsList.get(i);
                    if (currentTarget >= 0 && indexToShoot != i){
                        if (currentTarget > shotTarget){
                            targetsList.set(i, currentTarget - shotTarget);
                        } else {
                            targetsList.set(i, currentTarget + shotTarget);
                        }
                    }
                }
                targetsList.set(indexToShoot, -1);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTargetCount);
        System.out.print(targetsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
