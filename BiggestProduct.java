public class BiggestProduct{

    //$ The objective is to return the largest product between two different numbers in an array of ints.
    //$ The below method findBiggestProduct compares the product of the last 2 ints of the sorted
    //$ array and deduces the largest product
    public static void main(String[] args) {
        int[] arr = {-5, 0, 3, 1, -6, 5, 7, 8, 9, 5, 5, -4, -3};
        findBiggestProduct(arr);
    }
    private static void findBiggestProduct(int[] arr) {
        int[] arr1 = CountingSortV3.countingSort(arr);
        System.out.println(Math.max(arr1[0]*arr1[1], arr1[arr1.length-2]*arr1[arr1.length-1]));
    }  
}