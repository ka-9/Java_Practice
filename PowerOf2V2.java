import java.util.Scanner;
public class PowerOf2V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = 0;
        do {
        System.out.println("Enter a value to check: ");
        val = scan.nextInt();
        } while (val < 0);

        if ((val & (val-1))==0) {
            System.out.println(val +  " is a power of 2.");
        } else {
            System.out.println(val + " is not a power of 2.");
        }
        scan.close();
    }
    
}
