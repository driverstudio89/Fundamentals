package Exercise_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|$%\\.]*\\|(?<count>[0-9]+)\\|[^\\|$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customerName = matcher.group(1);
                String product = matcher.group("product");
                String countStr = matcher.group("count");
                int count = Integer.parseInt(countStr);
                String priceStr = matcher.group("price");
                double price = Double.parseDouble(priceStr);

                double totalPrice = count * price;
                sum += totalPrice;
                System.out.printf("%s: %s - %.2f%n", customerName, product, totalPrice);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", sum);

    }
}
