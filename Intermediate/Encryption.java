import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr, encryptedStr, decryptedStr;
        System.out.println("Enetr S: ");
        inputStr = scan.nextLine();

        encryptedStr = encrypt(inputStr);
        decryptedStr = decrypt(encryptedStr);

        System.out.println("Encrypted message: " + encryptedStr);
        System.out.println("Decrypted message: " + decryptedStr);
    }

    // Exam is fun becomes 5 4 4 7 Easfnxmiu
    private static String encrypt(String inputStr) {
        String output;
        output = indexCount(inputStr) + " " + encryptEven(inputStr) + encryptOdd(inputStr);

    }
    // Counts the number of even chars
    private static String indexCount(String inputStr) {
        int evenCount, wsCount, oddCount;
        String output, wsIndex = "";
        for (int idx = 0; idx < inputStr.length(); idx  = idx + 2) {
            if (inputStr.charAt(idx) == " ") {
                wsCount++;
                wsIndex += idx;
                continue;
            }
            evenCount++;
        }
        oddCount = inputStr.length() - wsCount - evenCount;

        output = evenCount + " " + oddCount + " " + wsCount;
        return output; 
    }
}