import java.util.Scanner;
public class UniqueChars {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Input a string: ");
        String inputStr = scan.nextLine();

        int uniqueChars = 0;
        String uniqueStr = "";

        for(int idx1 = 0; idx1 < inputStr.length(); idx1++){
            uniqueChars = 0;
            int currentChar = inputStr.charAt(idx1) - '0';
            int idx2 = 0;

            for(; idx2 < inputStr.length(); idx2++) {
                int otherChars = inputStr.charAt(idx2) - '0';

                if (idx1 == idx2){
                    continue;
                } else if (currentChar == otherChars) {
                    uniqueChars++;
                }
                
            } if (uniqueChars == 0){
                uniqueStr += inputStr.charAt(idx1) + ""; // +=uniqueChars wrong because it's an int value
            }
        }
        System.out.println("Nb. of unique Chars: " + uniqueStr.length());
        scan.close();
    }   
    
}
