import java.util.Scanner;

public class MatricInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        int[][] c = new int[4][4];

        System.out.println("Enter the value for Matrix A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter for Row " + (i + 1));
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();

        }

        System.out.println("Enter the value for Matrix B: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter for Row " + (i + 1));
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}