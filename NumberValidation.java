import java.util.Scanner;
public class NumberValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val;
        System.out.println("Enter a value to check: ");
        val = scan.nextInt();
        int valPlaceHolder = val;
        scan.nextLine();

        int lastDigit = 0, s1 = 0, s2 = 0;
        while(val != 0) {
            lastDigit = val % 10;
            s1 += lastDigit;
            if (lastDigit % 2 != 0) {
                s2 += lastDigit;
            }
            val /= 10;
        }
        if ((s1 + s2) % 10 == 0) {
            System.out.println(valPlaceHolder + " is valid.");
        } else {
            System.out.println(valPlaceHolder + " is invalid.");
        }
        scan.close();

    }
    
}
