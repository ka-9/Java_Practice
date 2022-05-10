import java.util.*;
import java.text.DecimalFormat;
public class roots {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.####");

		System.out.println("Enter the value of a: ");
		int a = scanner.nextInt();

		System.out.println("Enter the value of b: ");
		int b = scanner.nextInt();

		System.out.println("Enter the value of c: ");
		int c = scanner.nextInt();

		double sol1 = (Math.sqrt(Math.pow(b, 2) - 4*a*c) - b)/(2*a);
		double sol2 = (Math.sqrt(Math.pow(b, 2) - 4*a*c) + b)/(2*a);

		System.out.println("Solution 1: " + fmt.format(sol1) + "; Solution 2: " + fmt.format(sol2));
		scanner.close();
	}
}