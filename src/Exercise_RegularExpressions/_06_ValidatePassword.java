package Exercise_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String password = matcher.group();
                StringBuilder category = new StringBuilder();
                for (char symbol : password.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        category.append(symbol);
                    }
                }
                if (category.length() == 0) {
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + category);
                }


            } else {
                System.out.println("Invalid pass!");
            }
        }

    }
}
