package Jour01.Job14;

import java.util.Scanner;
public class Somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        int number1 = scanner.nextInt();

        System.out.print("Number two: ");
        int number2 = scanner.nextInt();


        int result = number1 + number2;
        System.out.println("Sum of your number: " + number1 + " + " + number2 + " = " + result);
    }
}
