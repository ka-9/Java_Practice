import java.util.Scanner;
public class Encryption {
    private static int evenCount = 0, oddCount = 0, wsCount = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr, encryptedStr, decryptedStr;
        System.out.println("Enter S: ");
        inputStr = scan.nextLine();

        encryptedStr = encrypt(inputStr);
        //decryptedStr = decrypt(encryptedStr);

        System.out.println("Encrypted message: " + encryptedStr);
        //System.out.println("Decrypted message: " + decryptedStr);
    }

    // Exam is fun becomes 5 4 4 7 Easfnxmiu
    private static String encrypt(String inputStr) {
        String output;
        output = evenCount + " " + oddCount + " " + wsCount + evenChars(inputStr) + oddChars(inputStr);
        return output;
    }
    private static String evenChars(String inputStr) {
        String evenChars = "";
        for (int idx = 0; idx < inputStr.length(); idx++) {
            if (inputStr.charAt(idx) == ' ') {
                continue;
            }
            evenCount++;
            evenChars += inputStr.charAt(idx);
        }
        return evenChars;
    }
    private static String oddChars(String inputStr) {
        String oddChars = "";
        for (int idx = 0; idx < inputStr.length(); idx++) {
            if (inputStr.charAt(idx) == ' ') {
                continue;
            }
            oddCount++;
            oddChars += inputStr.charAt(idx);
        }
        return oddChars;
    }
}