import java.util.Scanner;
public class Sec2HMS {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int secNb, hrNb, minNb;

	System.out.println("Enter time duration (in seconds): ");
	secNb = scan.nextInt();

	hrNb = (int) (secNb / 3600.0);
	secNb %= 3600;

	minNb = (int) (secNb / 60.0);
	secNb %= 60;

	System.out.println("This time duration amounts to: " + hrNb + " hours, " + minNb + " minutes, and " + secNb + " seconds"); 

	




	}
}
