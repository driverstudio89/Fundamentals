package Exercise_MapsLambdaandStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, ArrayList<String>> companyMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            companyMap.putIfAbsent(company, new ArrayList<>());
            if (!companyMap.get(company).contains(employeeId)) {
                companyMap.get(company).add(employeeId);
            }
            input = scanner.nextLine();
        }
        companyMap.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
