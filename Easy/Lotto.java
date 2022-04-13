public class Lotto {
    public static void main (String[] args) {
        String lotoSequence = "";
        int num = 0;
        int idx = 0;
        do {
            num = (int) (Math.random()*42 + 1);
            if (lotoSequence.contains("" + num)) {
                num = (int) (Math.random()*42 + 1);
                idx--;
            }
            lotoSequence += ("" + num + "\t");
            idx++;
        } while (idx < 7);
        lotoSequence += "\n";
        System.out.println(lotoSequence);
    }
}