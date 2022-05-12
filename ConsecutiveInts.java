/*
*Write a Java program that reads from the user an array of integer numbers and a
*positive integer x, and then counts the number of times x identical numbers occur
*next to each other in the array
*/

import java.util.Scanner;
public class ConsecutiveInts{
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        while(size <=0) {
            System.out.print("Wrong input! Size should be positive!" + "Try again: ");
            size = scanner.nextInt();
            scanner.nextLine();
        }

        int [] A = new int[size];
        System.out.print("Enter elements of array A: ");
        for(int i=0; i< A.length; i++) {
            A[i] = scanner.nextInt(); 
            scanner.nextLine();
        }

        int x, n, occurrences  = 0;
        System.out.println("Enter x: ");
        x = scanner.nextInt();
        scanner.nextLine();

        while (x < 0 ) {
            System.out.println("Enter x > 0: ");
            x = scanner.nextInt();
            scanner.nextLine();
        }

        n = x;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] == A[i+1]) x--;
            else x = n;
            if (x == 1) {
                occurrences++;
                x = n;
            }
            
        }
        System.out.println("The number of occurrences of " + n + " consecutive identical numbers: " + occurrences);
        scanner.close();

    }
}

