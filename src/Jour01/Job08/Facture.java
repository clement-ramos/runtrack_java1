package Jour01.Job08;

public class Facture {
    public static void main(String[] args) {
        float price = 49.99F;
        int quantity = 3;

        float tva = 0.20F;

        float total = quantity * price;
        float tax = total * tva;
        float result = total + tax;

        System.out.println("The total amount is " + total);
        System.out.println("The amount of tax is " + tax);
        System.out.println("The total amount to be paid " + result);

    }
}
