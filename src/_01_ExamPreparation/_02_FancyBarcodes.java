package _01_ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            StringBuilder productGroup = new StringBuilder();
            if (matcher.find()) {
                for (int j = 0; j < input.length(); j++) {
                    char symbol = input.charAt(j);
                    if (Character.isDigit(symbol)) {
                        productGroup.append(symbol);
                    }
                }
                if (productGroup.length() > 0) {
                    System.out.printf("Product group: %s%n", productGroup);
                } else {
                    System.out.println("Product group: 00");
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
