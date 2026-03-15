package Arrays;

import java.util.Arrays;

public class IntroArray {
    public static void main(String[] args) {
        // System.err.println("Hello, World!");
        // Initialization
        // int[] arr = new int[3];
        // arr[0] = 10;
        // arr[1] = 10;
        // arr[2] = 10;

        // Printing Array
        // Using enhanced for loop
        // for (int value : arr) {
        // System.err.println(value);
        // }

        // System.err.println(arr.length);

        // Reverse Array
        // for (int i = arr.length; i > 1; i--) {
        // System.err.println(arr[0]);
        // }

        // 2D Arrays
        // int[][] matrix = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // // Transversing Array
        // for (int[] val : matrix) {
        // for (int vals : val) {
        // System.err.print(vals + "");
        // }
        // System.err.println();
        // }

        // 12. Jagged Arrays

        // Java arrays can have different column sizes.

        // Example:

        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];

        // Structure:

        // [ _, _ ]
        // [ _, _, _, _ ]
        // [ _, _, _ ]

        for (int[] vals : arr) {
            for (int val : vals) {
                System.err.print(val + "");
            }
            System.err.println();
        }

        // This is called a jagged array.
    }

}
