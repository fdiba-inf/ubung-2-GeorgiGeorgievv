package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int two = number % 10;
        int tree = (number / 10) % 10;
        int four = number / 100;

        if (number >= 0 && number <= 999) {
            System.out.print("Sum of digits: ");
            System.out.println(two + tree + four);
        } else {
            System.out.println("Choose a number between 0 and 999");
        }
    }
}
