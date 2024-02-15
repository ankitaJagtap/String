public class ReverseString {
    public static void main(String[] args) {
        String s = "Ajay";
        int len = s.length();
        char[] arr = s.toCharArray();
        int i, j;
        char temp = 'a';
        for (i = 0, j = len - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        System.out.println(arr);
    }
}
