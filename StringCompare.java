public class StringCompare {

    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "A";
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) {
                if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {
                    if (str1.charAt(i) != str2.charAt(j) - 32) {
                        break;
                    }
                } else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                    if (str1.charAt(i) != str2.charAt(j) + 32) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i++;
            j++;
        }
        if (str1.length() == '\0' && str2.length() == '\0') {
            System.out.println("Both the strings are same");
        } else {
            System.out.println("Strings are not same");
        }

    }

}
