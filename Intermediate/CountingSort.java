package Intermediate;
import java.util.Arrays;
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 3, 0, 9, 7, 3, 5, 2, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        countingSort(arr);
    }
    //TODO: Make it work with negative values
    // currently only working with positive values

    private static void countingSort(int[] arr) { //feature Efficient int sorting algorithm based on prefix sums
        final int MAX_INT = findMaxInt(arr) + 1;
        int[] counts = new int[MAX_INT]; //step#1: Find max int

        for (int idx : arr) { //step#2: Cycle through arr and populate counts with nb of occurrences of each int
            counts[idx]++;
        }

        int[] prefixSums = new int[MAX_INT]; //step#3: Create and populate prefixSums 
        prefixSums[0] = counts[0];
        for (int idx = 1; idx < MAX_INT; idx++) {
            prefixSums[idx] = prefixSums[idx-1] + counts[idx];
        }

        int[] indexes = new int[MAX_INT]; //step#4: Create and populate indexes that references the index positions of the sorted elements of arr
        for (int idx = 0; idx < MAX_INT; idx++) {
            indexes[idx] = prefixSums[idx] - counts[idx];
        }

        int[] sorted = new int[arr.length]; //step#5: Create the sorted version of arr using indexes int[] indexes
        for (int i = 0; i < MAX_INT; i++) {
            if (counts[i] == 0) {
                continue;
            }
            sorted[indexes[i]] = i;  
        }
        for (int i = 1; i < sorted.length; i++) { //step#6 fill in the missing 0s with the corresponding previous index
            if (sorted[i] == 0) {
                sorted[i] = sorted[i-1];
            }
        }
        System.out.println("Using counting sort: " + Arrays.toString(sorted));
    }

    private static int findMaxInt(int[] arr) { //feature supporting method to countingSort
        int max = 0; // only used for positive values
        for (int idx : arr) {
            if (idx > max) max = idx;
        }
        return max;
    }
    
}
