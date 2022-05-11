import java.util.Scanner;
public class MiddleElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA, sizeB;
        do {   
        System.out.println("Enter the size of A: ");
        sizeA = scanner.nextInt();
        scanner.nextLine();
        } while (sizeA < 0 || sizeA % 2 == 0);

        do {   
        System.out.println("Enter the size of B: ");
        sizeB = scanner.nextInt();
        scanner.nextLine();
        } while (sizeB < 0 || sizeB % 2 == 0);

        int[] A = new int[sizeA], B = new int[sizeB];
        
        System.out.println("Enter the elements of A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Enter the elements of B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int[] C = {A[A.length/2], B[B.length/2]};
        System.out.println("Middle Elements: " + C[0] + " and " + C[1]);

        scanner.close();
    }
}
