package MidExam_18June2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shelfList = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            if (input.contains("Add Book")){
                String bookName = input.split("\\|")[1].trim();
                if (!shelfList.contains(bookName)) {
                    shelfList.add(0, bookName);
                }
            } else if (input.contains("Take Book")) {
                String bookName = input.split("\\|")[1].trim();
                shelfList.remove(bookName);

            } else if (input.contains("Swap Book")) {
                String bookName1 = input.split("\\|")[1].trim();
                String bookName2 = input.split("\\|")[2].trim();
                if (shelfList.contains(bookName1) && shelfList.contains(bookName2)){
                    int book1Index = shelfList.indexOf(bookName1);
                    int book2Index = shelfList.indexOf(bookName2);
                    shelfList.set(book1Index, bookName2);
                    shelfList.set(book2Index, bookName1);
                }

            } else if (input.contains("Insert Book")) {
                String bookName = input.split("\\|")[1].trim();
                if (!shelfList.contains(bookName)) {
                    shelfList.add(bookName);
                }

            } else if (input.contains("Check Book")) {
                int index = Integer.parseInt(input.split("\\|")[1].trim());
                if (index >= 0 && index < shelfList.size()) {
                    String bookName = shelfList.get(index);
                    System.out.println(bookName);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(shelfList.toString().replaceAll("[\\[\\]]", ""));
    }
}
