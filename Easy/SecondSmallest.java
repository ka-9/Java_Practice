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
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second smallest element: "  + secondSmallest);
        } else {
            System.out.println("Could not find second smallest element: ");
        }
    }	
    private static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
}