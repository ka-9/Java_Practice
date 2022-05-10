import java.util.Scanner;

public class RowSwitching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ROWS = 3;
        final int COLS = 3;

        int i1, i2, temp;

        int[][] arr = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            System.out.println("Enter the values for the #" + (i+1) + " row of integers: ");
            for (int j = 0; j < COLS; j++) {
                arr[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        System.out.println("Before switching: ");
        for (int i = 0; i < ROWS; i++) {
            for (int j =0; j < COLS; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 

        do{
            System.out.println("Enter i1: ");
            i1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter i2: ");
            i2 = scanner.nextInt();
            scanner.nextLine();

        } while (i1 == i2 || i1 < 0 || i2 < 0 || i1 >= ROWS || i2 >= ROWS);

        for (int i = 0; i < ROWS; i++) {
            temp = arr[i1][i];
            arr[i1][i] = arr[i2][i];
            arr[i2][i] = temp;
        }

        System.out.println("After switching: ");
        for (int i = 0; i < ROWS; i++) {
            for (int j =0; j < COLS; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }        
        scanner.close();
    }
}