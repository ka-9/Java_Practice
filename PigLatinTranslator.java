import java.util.Scanner;
public class PigLatinTranslator {

    public PigLatinTranslator() {
    }

    public static void translate(String sentence) {
        Scanner scanS = new Scanner(sentence);
        String sentenceTranslated = "";
        while (scanS.hasNext()) {
            sentenceTranslated += translateWord(scanS.next()) + " ";
        }
        System.out.println(sentenceTranslated);
        scanS.close();
    }

    private static String translateWord(String word) {
        String output = "";
        if (isVowel(word)) {
            output = word + "yay";
            return output;
        } else {
            output = word.substring(1) + word.charAt(0) + "ay";
            return output;
        }
    }
    
    private static boolean isVowel(String word) {
        String vowels = "aeouiAEOUI";
        if (vowels.indexOf(word.charAt(0)) != -1) {
            return true;
        } else {
            return false;
        }
    }
}
