package LabObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Students {

    public static class Student {

        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Student(String firstName , String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }
        public String getHomeTown() {
            return this.homeTown;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public String getAge() {
            return this.age;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")){
            String[] studentArr = input.split(" ");

            String firstName = studentArr[0];
            String lastName = studentArr[1];
            String age = studentArr[2];
            String homeTown = studentArr[3];

            Student currentStudent = new Student(firstName, lastName, age, homeTown);

            studentList.add(currentStudent);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getHomeTown().equals(city)){
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}
