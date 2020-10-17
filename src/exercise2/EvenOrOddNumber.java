package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        System.out.print("Number is ");
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


    }
}
