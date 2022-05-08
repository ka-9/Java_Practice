import java.util.Scanner;
public class HeronFormula {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		double s, subResult, result;
 
		System.out.println("Enter the value of a: ");
		a = scan.nextInt();

		System.out.println("Enter the value of b: ");
		b = scan.nextInt();

		System.out.println("Enter the value of c: ");
		c = scan.nextInt();

		s = (a + b + c)/2.0;

		subResult = s * (s - a) * (s - b) * (s - c);

		result = Math.sqrt(subResult);
		System.out.println(result);
		
		scan.close();
		
	}
}