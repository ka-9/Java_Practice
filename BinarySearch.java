import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pool = {1, 4, 5, 8, 9}; //, 13, 15, 16, 17, 19, 22, 25, 30, 34, 40};

        System.out.println("Enter a target value: ");
        int target = scanner.nextInt();
        scanner.nextLine();

        binarySearch(target, pool);
        scanner.close();
    }
    private static void binarySearch(int target, int[] pool) {
        boolean flag = false;
        int left = 0, right = pool.length-1, middle = 0;

        while (!flag && left <= right) {
            middle = left + (right - left) / 2;
            
            // binary search for an ordered list of values (ascending order)
            if (pool[middle] == target) {
                flag = true;
            } else if (pool[middle] < target) {
                left = middle + 1;
            } else if (pool[middle] > target) {
                right = middle -1;
            }
        }

        if (flag) 
        System.out.println("Target found at index " + middle);
        else
        System.out.println("Target not found");

    }
    
}
