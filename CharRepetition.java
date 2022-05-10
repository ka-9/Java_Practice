import java.util.Scanner;
public class CharRepetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr;
        System.out.println("Enter a string: ");
        inputStr = scan.nextLine();

        if (checkUniqueChar(inputStr)) {
            System.out.println(inputStr + " has no repeted characters");
        } else {
            System.out.println(inputStr + " has repeted characters");
        }
        System.out.println(palindromeCheck(inputStr));
        
        scan.close();
    }



    private static boolean checkUniqueChar(String inputStr) {
        for (int idx1 = 0; idx1 < inputStr.length(); idx1++) {
            if (inputStr.indexOf(inputStr.charAt(idx1)) != inputStr.lastIndexOf(inputStr.charAt(idx1))) {
                return false;
            }
        }
        return true;
        
    }
    private static boolean palindromeCheck(String str) {
        int pointer1 = 0, pointer2 = str.length()-1;
        while(pointer1 < pointer2) {
            if (str.charAt(pointer1) != str.charAt(pointer2)) {
                return false;
            }
            pointer1++;
            pointer2--;
        }
        return true;
    }
    
}
