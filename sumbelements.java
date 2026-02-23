import java.util.*;

public class sumbelements {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int a = se.nextInt();

        System.out.print("Enter number of columns: ");
        int b = se.nextInt();

        int[][] matrix = new int[a][b];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = se.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
              
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of border elements: " + sum);
        se.close();
    }
}
