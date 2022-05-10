import java.util.Scanner;
public class MinMaxCharacter2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter a string to process");
        str = scanner.nextLine();
        checkMinMax(str);
        scanner.close();
    } 
    private static void checkMinMax(String str){

        int occurrences = 0, minOcc = str.length(), maxOcc = 0;
        char minChar = '\0';
        char maxChar = '\0';

        for (int idx  = 0; idx < str.length(); idx++) {
            occurrences = 0;
            if (str.charAt(idx) == ' ') {
                continue;
            }
            for (int idx2 = 0; idx2 < str.length(); idx2++) {
                if (str.charAt(idx) == str.charAt(idx2)) {
                    occurrences++;
                }
            }
            if (occurrences < minOcc){
                minChar = str.charAt(idx);
                minOcc = occurrences;
            }
            if (occurrences > maxOcc){
                maxChar = str.charAt(idx);
                maxOcc = occurrences;
            }
        }
        System.out.println("Character with max number of occurrences: " + maxChar + "\nCharacter with min number of occurrences: " + minChar);

    }
}

