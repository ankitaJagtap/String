public class ReverseSentence {

    public static void reverse(String s) {
        int i = 0;
        int j = 0;
        String[] str = s.split(".");
        for (String se : str) {
            System.out.println(se);
        }
    }

    public static void main(String[] args) {
        // i.like.this.program.very.much
        String s = "i.like.this.program.very.much";
        System.out.println(s);
        String[] str = s.split(".");
        for (String se : str) {
            System.out.print(se);
        }
        reverse(s);
    }
}
