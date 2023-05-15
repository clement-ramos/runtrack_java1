package Jour01.Job09;

public class MyString {
    public static void main(String[] args) {

        String string1 = "Hello world!";

        String string2 = new String("Hello world!");

        String string3 = "Hello" + " world!";

        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        String string4 = new String(chars);


        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
    }
}
