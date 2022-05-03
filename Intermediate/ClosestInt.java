package Intermediate;

import java.util.Scanner;
public class ClosestInt {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int nbs;
        int target = (int) (Math.random()*999 + 1);

        System.out.println("Enter sequence of numbers: ");
        nbs = scan.nextInt();
        int closeNb = nbs;

        while (nbs != -1) {
            if (nbs > 0) {
                if (Math.abs(target - nbs) < Math.abs(target - closeNb)) {
                    closeNb = nbs;
                }
            }
            nbs = scan.nextInt();
        }
        System.out.println("The closest number to " + target + " is " + closeNb);


        
    }
}
