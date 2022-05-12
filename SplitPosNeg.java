import java.util.Arrays;
import java.util.Scanner;
public class SplitPosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        while (n < 0) {
            System.out.println("Enter size of array: ");
            n = scanner.nextInt();
            scanner.nextLine();
        }

        int[] A = new int[n];
        System.out.println("Enter elements of array A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println(Arrays.toString(splitPosNeg(A)));
        scanner.close();
    }
    private static int[] splitPosNeg(int[] A) {
        int[] B = new int[A.length];
        int pos = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] + "") == null  || A[i] >= 0) {
                B[pos] = A[i];
                pos++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                B[pos] = A[i];
                pos++;
            }
        }
        return B;
    }
}
