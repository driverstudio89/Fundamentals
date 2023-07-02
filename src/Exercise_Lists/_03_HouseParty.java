package Exercise_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];
            if (command.contains("is going!")){
                if (guestList.contains(name)){
                    System.out.println(name + " is already in the list!");
                } else {
                    guestList.add(name);
                }
            } else if (command.contains("is not going!")){
                if (guestList.contains(name)){
                    guestList.remove(name);
                }else {
                    System.out.println(name +  " is not in the list!");
                }
            }
        }
        for (String person : guestList) {
            System.out.println(person);
        }
    }
}
