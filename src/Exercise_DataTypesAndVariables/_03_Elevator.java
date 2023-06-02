package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _03_Elevator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourse = numberOfPeople / capacity;

        if (capacity > numberOfPeople) {
            System.out.println(1);
        } else if (numberOfPeople % capacity == 0) {
            System.out.println(fullCourse);
        } else if (numberOfPeople % capacity != 0) {
            System.out.println(fullCourse + 1);
        }
    }
}
