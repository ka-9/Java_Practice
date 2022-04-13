import java.util.Scanner;
public class Test2 {
	public static void main (String[] args) {
		String first, last, middle, full, fullNew;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		full = scan.nextLine();
	
		first = full.substring(0, full.indexOf(" "));
		middle = full.substring(full.indexOf(" ") + 1, full.lastIndexOf(" "));
		last = full.substring(full.lastIndexOf(" ") + 1);

		fullNew = last + " " + first + " " + middle;
		System.out.println("\nOutput: " + fullNew);
	}
}