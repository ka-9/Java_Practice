import java.util.Scanner;
public class PrintingStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N;
        System.out.println("Enter N: ");
        N = scan.nextInt();
        scan.nextLine();
        for (int idx1 = 1; idx1 <= N; idx1++) {
            for (int idx2 = 0; idx2 < idx1; idx2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int idx1 = N-1; idx1 > 0; idx1 --) {
            for(int idx2 = 0; idx2 < idx1; idx2++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
