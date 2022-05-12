import java.util.Scanner;
public class ReadingArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array A: ");
        n = scanner.nextInt();
        scanner.nextLine();

        while (n<0) {
            System.out.println("Enter size of array A: ");
            n = scanner.nextInt();
            scanner.nextLine();
        }

        int[] A = new int[n], B = new int[n];

        System.out.println("Enter integer elements of array A: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Enter integer elements of array B: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element B[" + i + "] ");
            B[i] = scanner.nextInt();
            scanner.nextLine();

            while ((int) Math.abs(B[i] - A[i]) > 2) {
                System.out.println("Difference between A[" + i + "] and B[" + i + "] is >2! Enter element B[" + i + "] again: ");
                B[i] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        System.out.print("Elements of Array B: ");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
        scanner.close();
    }
}
