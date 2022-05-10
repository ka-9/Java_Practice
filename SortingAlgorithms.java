package Intermediate;
import java.util.Arrays;
public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 3, 0, 9, 7, 3, 5, 2, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        countingSort(arr);
    } 

    private static void bubbleSort(int[] arr) { //feature The bigger values float to the top
        boolean isSorted = false;
        int passes = 0; //! important
        while (!isSorted) {
            isSorted = true;

            for (int j = 0; j < arr.length - 1 - passes; j++) { //! always parse through all the elements in one pass
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    isSorted = false; 
                }
            }
            passes++;
        }
        System.out.println("Using bubble sort: " + Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) { //feature Check all the elements after you, and swap you with the minimum if it is less than you
        for (int i = 0; i < arr.length - 1; i++) { // no need to scan the last time since the last element falls in place
            int min = i;
            for (int j = i + 1; j < arr.length; j++) { // skip the first element and scan through the rest of the array
                if (arr[j] < arr[min]) { // running minimum //! arr[j] < arr[min] to keep track of the true minimum, take ex. {3, 4, 1, 2}
                    min = j;
                }
            }
            swap(arr, min, i);
        }
        System.out.println("Using selection sort: " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) { //feature Are you less than your predecessor?
        for (int i = 1; i < arr.length; i++) {
            int scan = i;
            while (scan > 0 && arr[scan] < arr[scan-1]) { // while my index is not 0 and I am still smaller than my predecessor
                swap(arr, scan, scan-1);
                scan--; // check to see if I am still smaller
            }
        }
        System.out.println("Using insertion sort: " + Arrays.toString(arr));

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
    
    private static void swap(int[] arr, int min, int j) {
        int temp = arr[min];
        arr[min] = arr[j];
        arr[j] = temp;
    }   
}
