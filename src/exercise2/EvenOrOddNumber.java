package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Number is ");
         if (number % 2 == 0) {
             System.out.println("even");
         } else {
             System.out.println("odd");
         }


    }
}
