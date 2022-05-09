import java.util.Scanner;
public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr;

        System.out.println("Enter a string to process:");
        inputStr = scanner.nextLine();

        checkFrequency(inputStr);
        scanner.close();
    }
    private static void checkFrequency(String inputStr) {
        char currentChar = '\0';
        final int LETTERS = 26;
        int otherChars = 0;
        int[] lower = new int[LETTERS];
        int[] upper = new int[LETTERS]; 

        // populate the arrays
        for (int i = 0; i < inputStr.length(); i++) {
            currentChar = inputStr.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                lower[currentChar - 'a']++;
            } else if (currentChar >= 'A' && currentChar <= 'Z') {
                upper[currentChar - 'A']++;
            } else {
                otherChars++;
            }
        }

        // print out the summary
        for (int i = 0; i < LETTERS; i++) {
            System.out.print((char) (i + 'a') + ": " + lower[i] + " ");
            System.out.println((char) (i + 'A') + ": " + upper[i]);
        }
        System.out.println("Other chars: " + otherChars);
    }
}