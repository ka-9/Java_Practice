import java.util.Scanner;
public class Encryption {
    private static int evenCount = 0, oddCount = 0;
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
        Scanner scanS = new Scanner(inputStr);

    }
}