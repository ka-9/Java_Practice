import java.util.Scanner;
public class Intruder {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        char intruder = str.charAt(0);
        for (int counter1 = 1; counter1 < str.length(); counter1++) {
            intruder ^= str.charAt(counter1);
        }
        System.out.println(intruder);
        scan.close();
    }
}