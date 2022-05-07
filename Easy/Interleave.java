import java.util.Scanner;
public class Interleave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        System.out.println("Enter the first 10 values:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Enter the second 10 values:");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = scanner.nextInt();
            scanner.nextLine();
        }


        interleave(arr1, arr2);
    }
    private static void interleave(int[] arr1, int[] arr2) {
        int[] arr3 = new int[20];
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 0) {
                arr3[i] = arr1[i/2];
            } else {
                arr3[i] = arr2[i/2];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    
}
