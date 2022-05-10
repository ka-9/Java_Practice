import java.util.Scanner;
public class Bits2HT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr;
        System.out.println("Enter a 9 characters string of 0s and 1s: ");
        inputStr = scanner.nextLine();
        scanner.close();

        convert2HT(inputStr);
    }
    private static void convert2HT(String inputStr) {
        if (inputStr.length() != 9) {
            System.out.println("Invalid input length");
            return;
        }
        char[] arr = new char[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputStr.charAt(i);
        }
        int counter = 0;
        for (char bit : arr) {
            switch(bit) {
                case '0':
                System.out.print("H");
                break;
                case '1':
                System.out.print("T");
            }
            counter++;
            if (counter % 3 == 0)
                System.out.println();
        }
    }
}
