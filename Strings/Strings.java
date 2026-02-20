package Strings;

public class Strings {

    public static void main(String[] args) {
        // int a = 10;
        // int b = 10;
        // System.out.println(a == b);
        // // true

        // String sa = "Hello";
        // String sb = new String("Hello");
        // System.out.println(sa == sb);
        // String Builder -> THis is a mutable sequence of characters. It is used to create and manipulate strings efficiently, especially when concatenating multiple strings together. Unlike regular strings (which are immutable), StringBuilder allows you to modify the contents of the string without creating a new object each time.
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World");
        sbuilder.append(10);
        sbuilder.append(true);
        System.out.println(sbuilder);

    }
}
