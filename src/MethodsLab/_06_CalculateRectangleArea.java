package MethodsLab;

import java.util.Scanner;

public class _06_CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = getRectangleArea(width, length);

        System.out.println(area);


    }
    public static int getRectangleArea(int sideA, int sideB){
        return sideA * sideB;
    }

}
