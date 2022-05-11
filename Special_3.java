/*
*Write a program called Special_3 which reads the elements of an array of
*integer values from the user, and then searches the elements of the array and
*checks whether there is an element = 2 that is immediately followed by an
*element = 3. Each time such a combination is located in the array, your program
*must change the value of the element that equals 3 to 0. Finally, your program
*must print out all the elements of the resulting modified array. 
*/

import java.util.Arrays;
import java.util.Scanner;
public class Special_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Initial array: " + Arrays.toString(arr));
        for (int i = 0; i < size-1; i++) {
            if (arr[i] == 2 && arr[i+1] == 3) {
                arr[i+1] = 0;
            }
        }
        System.out.println("The updated elements of the array: " + Arrays.toString(arr));
        scanner.close();
    }
}
