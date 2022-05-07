import java.util.Arrays;
public class Shuffle {
    public static void main(String[] args){
        int[] arr = new int[52];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println("Before shuffle: " + Arrays.toString(arr));
        Shuffle(arr);
        System.out.println("After shuffle: " + Arrays.toString(arr));
    }
    private static void Shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rnd = (int) (Math.random()*(52-i) + i);
            int temp;
            temp = arr[i];
            arr[i] = arr[rnd];
            arr[rnd] = temp;
        }
    }
    
    
}
