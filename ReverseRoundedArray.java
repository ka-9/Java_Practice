import java.util.Arrays;
import java.util.Scanner;
public class ReverseRoundedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter size: ");
        n = scanner.nextInt();
        scanner.nextLine();

        while (n < 0) {
            System.out.println("Wrong input! Size should be positive! Try again: ");
            n = scanner.nextInt();
            scanner.nextLine();
        }

        double [] A = new double[n];

        System.out.println("Elements of array A: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        
        System.out.println(Arrays.toString(reverseRoundedArray(A)));
        scanner.close();
    }
    private static int[] reverseRoundedArray(double[] A){
        int[] B = new int[A.length];
        for (int i = A.length-1; i >= 0; i--) {
            B[i] = (int) (Math.floor(A[A.length-1-i]));
        }
        return B;
    }
}