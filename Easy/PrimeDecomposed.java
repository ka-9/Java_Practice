import java.util.Scanner;
public class PrimeDecomposed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter an int to decompose: ");
        n = scan.nextInt();
        scan.nextLine();

        primeDecompose(n);
    }
    private static void primeDecompose(int n) {
        int exponent;
        for(int div = 2; div*div < n; div++) {
            if(n % div == 0) {
                exponent = 0;
                while (n % div == 0) {
                    n /= div;
                    exponent++;
                }
                System.out.print(div + "^" + exponent + " ");
            }
        }
        if (n>1)
            System.out.println(n + "^" + 1);
        else 
            System.out.println();
    } 
}