import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an int: ");
        n = scanner.nextInt();
        scanner.nextLine();

        checkPerfectNumber(n);
    }
    private static void checkPerfectNumber(int n) {
        int sum;
        System.out.print("1 ");
        
        for (int i = 1; i <= n; i++) {
            if (n % 2 != 0) {
                continue;
            }    
            sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
    
}
