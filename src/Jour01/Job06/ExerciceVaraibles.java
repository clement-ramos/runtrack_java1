package Jour01.Job06;

public class ExerciceVaraibles {
    public static void main(String[] args) {
        int num1 = 7, num2 = 14, buffer = 0;

        System.out.println("Number 1 :" + num1 + " Number 2 :" + num2 + " Number 2 :" + buffer);

        buffer = num1;
        num1 = num2;
        num2 = buffer;

        System.out.println("Number 1 :" + num1 + " Number 2 :" + num2 + " Number 2 :" + buffer);

    }
}
