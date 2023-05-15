package Jour01.Job13;

import java.util.*;
public class MaxLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your max: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print((i + 1));
            if (i != number - 1){
                System.out.print(", ");
            }
        }
    }
}
