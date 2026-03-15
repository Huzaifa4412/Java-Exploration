class MagicSquareMatrix {
    public static void main() {
        // Initializing Array
        int[][] magic = new int[3][3];
        int row = 0;
        int col = 3 / 2;

        // Conditions -> Must Start with First row middle Column
        // 1. Up-right Algorithm Logic. 2. If Index is out then wrap. 3. If
        // already placed then, move back to the next row

        for (int i = 1; i <= 3 * 3; i++) {
            magic[row][col] = i;

            int newRow = (row - 1 + 3) % 3;
            int newCol = (col + 1) % 3;

        }

        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[i].length; j++) {
                System.err.print(" " + i);
            }
            System.err.println();
        }
    }

}