package _04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] studentArr = scanner.nextLine().split(" ");

            String firstName = studentArr[0];
            String secondName = studentArr[1];
            Double grade = Double.parseDouble(studentArr[2]);

            Student student = new Student(firstName, secondName, grade);

            studentsList.add(student);
        }
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentsList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getsecondName(), student.getGrade());
        }

    }
}
