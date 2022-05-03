package Intermediate;

import java.util.Scanner;
public class SentenceCount {
    private static int wsCount = 0, digitCount = 0, vowCount = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;
        System.out.println("Enter a sentence: ");
        sentence = scan.nextLine();

        System.out.println(charCount(sentence));
    } 

    private static String charCount(String sentence) {
        String output = "";
        Scanner scanS = new Scanner(sentence);
        while (scanS.hasNext()) {
            String word = scanS.next();
            checkVow(word);
            checkDigit(word);
            wsCount++;
        }
        int consCount = sentence.length() - (wsCount - 1) - vowCount - digitCount;
        output = "The sentence is made up of: " + vowCount + " vowels, " + digitCount + " numbers, " + (wsCount-1) + " spaces and " +  consCount + " consonants.";
        return (output);
    }
    
    private static void checkVow(String word) {
        String vowels = "aeiouAEIOU";
        for (int idx = 0; idx < word.length(); idx++) {
            if (vowels.indexOf(word.charAt(idx)) != -1) {
                vowCount++;
            }
        }
    }

    private static void checkDigit(String word) {
        String digits = "0123456789";
        for (int idx = 0; idx < word.length(); idx++) {
            if (digits.indexOf(word.charAt(idx)) != -1) {
                digitCount++;
            }
        }
    }

}

