package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double determinant = (b * b) - (4 * a * c);
        double x = 0.0;
        double x1 = 0.0;
        double x2 = 0.0;


        if (a != 0 && determinant >= 0) {
            x1 = (-b + Math.sqrt(determinant)) / 2 * a;
            x2 = (-b - Math.sqrt(determinant)) / 2 * a;
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);

        } else if (determinant < 0) {
            System.out.println("Imaginary values");
        }
        if (a == 0 && b != 0) {
            x = -c / b;
            System.out.println("x: " + x);
        }
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("No values");
        }  if (a == 0 && b == 0 && c == 0) {
            System.out.println("Many values");
        }


    }
}
