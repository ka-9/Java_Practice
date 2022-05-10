public class SecondSmallest {
	/*
	 * Aim is to find second smallest
	 * element in an array efficiently.
	 * 
	 * Time complexity: O(n)
	 * Space complexity: O(1)
	 */
	public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 4, 9};
        int secondSmallest = findSecondSmallest(arr);
        if (secondSmallest != Integer.MAX_VALUE)
            System.out.println(secondSmallest);
        else
            System.out.println("Could not find second smallest");
    }
    private static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            } else if (i < secondSmallest && i != smallest) {
                secondSmallest = i;
            }
        }
        return secondSmallest;
    }
}