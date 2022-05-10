//! Very important
import java.util.Arrays;
public class CountingSortV2 {
    public static void main(String[] args) {
        int[] arr = {10, 0, 12, 1, 1, 1, 1, 2, 1, 2, 4, 3};
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

        //step#3: Create and populate counts with the prefix sums 
        for (int idx = 1; idx < MAX_INT; idx++) {
            counts[idx] = counts[idx-1] + counts[idx];
        }

        int[] sorted = new int[arr.length]; //step#4: Create the sorted version of arr, working in a descending order
        int element, sortedIndex;
        for (int idx = arr.length-1; idx >= 0; idx--) { //step#5 Get the sorted index of each element in arr
            element = arr[idx]; //get each element from arr in a descending order
            counts[element]--; //get the prefix sum at this element, and subtract 1
            sortedIndex = counts[element]; //this will then be the sorted index of the current element in the sorted array
            sorted[sortedIndex] = arr[idx]; 
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
