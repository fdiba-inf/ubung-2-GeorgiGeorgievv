package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double C = 2.0 * Math.PI * r;
        double A = Math.PI * r * r;

        System.out.println("Circumference: " + C);
        System.out.println("Area: " + A);


    }
}
