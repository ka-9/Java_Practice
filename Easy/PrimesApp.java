import java.util.Scanner;

public class PrimesApp{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an int");
		int val = scan.nextInt();

		if(isPrime(val)) {
			System.out.println(val + " is a prime number");
		} else {
			System.out.println(val + " is not a prime number");
		}
	}

	private static boolean isPrime(int val){
		if (val <= 1) {
			return false;
		}

		if (val ==2) {
			return true;
		}
		double sqrtVal = Math.sqrt(val);

		for (int divisor = 2; divisor <= sqrtVal; divisor++) {
			if (val % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
