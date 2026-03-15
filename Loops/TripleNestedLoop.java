package Loops;

public class TripleNestedLoop {
    public static void main(String[] args) {
        int[][][] tripleArray = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 }
                },
                {
                        { 7, 8, 9 },
                        { 10, 11, 12 }
                }
        };

        // Block
        for (int block = 0; block < tripleArray.length; block++) {

            System.err.println("Block: " + block);
            // Row
            for (int row = 0; row < tripleArray[block].length; row++) {
                System.err.println("Row: " + row);

                // Each Value inside Row yani column
                for (int elem = 0; elem < tripleArray[block][row].length; elem++) {
                    System.err.println("Element: " + tripleArray[block][row][elem]);

                }

                System.err.println();
            }
            System.err.println();

        }
    }

}
