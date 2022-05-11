import java.util.Scanner;
import java.text.DecimalFormat;
public class StirlingApprox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Enter n: ");
        n = scanner.nextInt();
        
        System.out.println("Using tradiitonal method: " + factorial(n));
        System.out.println("Using Stirling's appoximation: " + StirlingApprox(n));
        scanner.close();
    }
    private static int factorial(int n) {
        if (n == 0) return 1;
        for (int i = n-1; i > 0; i--) n*=i;
        return n;
    }
    private static String StirlingApprox(int n) {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double output = (Math.pow(n, n) * Math.sqrt(2*Math.PI*n))/Math.exp(n);
        String formatted = fmt.format(output);
        return formatted;
    }
}