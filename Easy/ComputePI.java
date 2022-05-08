import java.util.Scanner;
public class ComputePI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        System.out.println("Enter integer N: ");
        N = scan.nextInt();
        scan.nextLine();

        int denom = 3;
        double number = 1.0;
        double result = 1;
        for (int idx = 1; idx <= N; idx++) {
            number = 1.0 / denom;
            denom += 2;
            if (idx % 2 != 0) {
                number *= -1;
            }
            result += number;
        }
        System.out.println("Computed PI: " + 4*result);
        System.out.println("The difference with actual PI: " + Math.abs(Math.PI - 4*result));
        scan.close();
    }
    
}
