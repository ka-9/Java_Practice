import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val, valInit;
        System.out.println("Enter a value to check: ");
        valInit = scan.nextInt();
        val = valInit;


        while (val > 3) {
            val /= 2;
        }

        if (val % 2 != 0) {
            System.out.println(valInit + " is not a power of 2.");
        } else {
            System.out.println(valInit + " is a power of 2.");
        }
        
        scan.close();

    }
}