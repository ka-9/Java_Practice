

import java.util.Scanner;
import java.util.Arrays;
public class CountingCharacters {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] stringList = new String[3];

        for (int idx = 0; idx < stringList.length; idx++) {
            System.out.println("Enter String #" + (idx+1));
            stringList[idx] = scan.nextLine();
        }
        checkETNOccurences(stringList);
        scan.close();
    } 

    private static void checkETNOccurences (String[] stringList) {
        String etn = "etn";
        int[] occurences = new int[3];

        // Checks if there is no String at all before processing
        for (int idx = 0; idx < stringList.length; idx++){
            if (stringList[idx] == null || stringList[idx].length() == 0){
                continue;
            }
            int currentIndex = 0;
            for (int idx2 =0; idx2 < stringList[idx].length(); idx2++) {
                currentIndex = etn.indexOf(stringList[idx].charAt(idx2));
                switch(currentIndex) {
                    case -1:
                    continue;
                    case 0:
                    occurences[0]++;
                    break;
                    case 1:
                    occurences[1]++;
                    break;
                    case 2:
                    occurences[2]++;
                }
            }
        }
        System.out.println(Arrays.toString(occurences));
    }
}