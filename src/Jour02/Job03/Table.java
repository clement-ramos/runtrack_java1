package Jour02.Job03;

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        for (int i = 0; i < 11; i++) {
            String str = number + " X " + i + " = " + (i*number);
            System.out.println(str);
        }

        // closing the scanner object
        input.close();
    }
}
