package _03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String[] personArr = scanner.nextLine().split(" ");

            String name = personArr[0];
            int age = Integer.parseInt(personArr[1]);

            Person person = new Person(name, age);

            if (person.getAge() > 30) {
                personList.add(person);
            }
        }
        System.out.println(personList.toString().replaceAll("[\\[\\],]", ""));
    }
}
