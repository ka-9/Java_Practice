import java.util.Scanner;
public class CountingCharacters {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] stringList = new String[3];

        for (int idx = 0; idx < stringList.length; idx++) {
            System.out.println("Enter String #" + (idx+1));
            stringList[idx] = scan.nextLine();
        }
        checkETNOccurences(stringList);
    } 

    private static void checkETNOccurences (String[] stringList) {
        int[] counters = {0, 1, 2};
        String etn = "etn";

        // Checks if there are no occurences at all before processing
        for (int idx1 = 0; idx1 < etn.length(); idx1++) {
            if (stringList[idx1].indexOf(etn.charAt(idx1)) == -1) {
                System.out.println("No occurences of " + etn.charAt(idx1) + " in string number " + (idx1 + 1)); 
            }
            
            //bug counters[idx1] not working properly
            // Checking for the number of occurences by cycling through the arrays
            for (int idx2 = 0; idx2 < stringList[idx1].length(); idx2++) {
                if (stringList[idx1].charAt(idx2) == etn.charAt(idx1)) {
                    counters[idx1]++;
                }
            }
        }
        for (int idx3 = 0; idx3 < counters.length; idx3++) {
            if (counters[idx3] != 0) {
                System.out.println("There were " + counters[idx3] + " occurences of " + etn.charAt(idx3) + " in string " + (idx3 + 1));
            }
        }
    }
}
