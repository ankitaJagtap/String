/**
 * FindFrequency
 */
public class FindFrequency {

    public static void findFrequency(String ch) {
        int[] array = new int[1000];
        int n = ch.length();
        for (int i = 0; i < n; i++) {
            array[ch.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (array[ch.charAt(i)] > 0) {
                System.out.print(ch.charAt(i) + "" + array[ch.charAt(i)] + " ");
                array[ch.charAt(i)] = 0;
            }
        }
    }

    public static void main(String[] args) {
        String ch = "Ankita I Love You";
        findFrequency(ch);
    }
}