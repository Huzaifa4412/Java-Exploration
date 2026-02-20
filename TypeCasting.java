// Java Type Casting
// Type casting means converting one data type into another. For example, turning an int into a double.

// In Java, there are two main types of casting:
// Widening Casting (automatic) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
// Narrowing Casting (manual) - converting a larger type to a smaller type size
// double -> float -> long -> int -> char -> short -> byte
public class TypeCasting {

    public static void main(String[] args) {

        // Widening Casting (automatic)
//         Widening casting is done automatically when passing a smaller size type into a larger size type.
// This works because there is no risk of losing information. For example, an int value can safely fit inside a double:
        // int myInt = 9;
        // System.out.println(myInt);
        // double myDouble = myInt;
        // System.out.println(myDouble);
        // ! Error
        // byte myByte = myDouble;
        // System.out.println(myByte);
        // Narrowing Casting
//         Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
// This is required because narrowing may result in data loss (for example, dropping decimals when converting a double to an int):
        double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println(myInt);

    }
}
