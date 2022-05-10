//! Important
package Intermediate;
import java.util.Arrays;
public class CountingSortV3 {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 3, 1, -6, 5, 7, 8, 9, 5, 5, -4, -3};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        countingSort(arr);
    }
    //TODO: Now working with negative values as well
    //$ changes made: introduced MIN_INT that prevents negative indexes while sorting

    protected static int[] countingSort(int[] arr) { //feature Efficient int sorting algorithm based on prefix sums
        final int MAX_INT = findMaxInt(arr);
        final int MIN_INT = findMinInt(arr);
        final int LENGTH = (MAX_INT + MIN_INT) + 1;
        int[] counts = new int[LENGTH]; //step#1: Find max int

        
        for (int idx : arr) { //step#2: Cycle through arr and populate counts with nb of occurrences of each int
            counts[MIN_INT + idx]++; 
        }
        
        //step#3: Create and populate counts with the prefix sums 
        for (int idx = 1; idx < LENGTH; idx++) {
            counts[idx] = counts[idx-1] + counts[idx];
        }        
        
        int[] sorted = new int[arr.length]; //step#4: Create the sorted version of arr, working in a descending order
        int element, sortedIndex;
        for (int idx = arr.length-1; idx >= 0; idx--) { //step#5 Get the sorted index of each element in arr
            element = arr[idx]; //get each element from arr in a descending order
            counts[MIN_INT + element]--; //get the prefix sum at this element, and subtract 1
            sortedIndex = counts[MIN_INT + element]; //this will then be the sorted index of the current element in the sorted array
            sorted[sortedIndex] = arr[idx]; 
        }
        return sorted;
        
    }

    private static int findMaxInt(int[] arr) { //feature supporting method to countingSort
        int max = Integer.MIN_VALUE;
        for (int idx : arr) {
            if (idx > max) max = idx;
        }
        return max;
    }
    private static int findMinInt(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int idx : arr) {
            if (idx < min) min = idx;
        }
        return (int) Math.abs(min);
    }
    
}
