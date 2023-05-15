package Jour01.Job12;

import java.util.Scanner;
public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("first string: ");
        String string1 = scanner.nextLine();

        System.out.print("second string: ");
        String string2 = scanner.nextLine();

        System.out.println("\nstring1 before swap is: " + string1);
        System.out.println("string2 before swap is: " + string2);

        string1 += string2;
        string2 = string1.substring(0, (string1.length() - string2.length()));
        string1 = string1.substring(string2.length());

        System.out.println("\nstring1 after swap is: " + string1);
        System.out.println("string2 after swap is: " + string2);
    }
}
