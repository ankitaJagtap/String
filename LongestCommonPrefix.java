public class LongestCommonPrefix {

    public static void longestCommonPrefix(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int maxi = Integer.MIN_VALUE;
        if (n1 > n2) {

        } else {
            boolean flag = true;
            int temp1 = 0;
            int i;
            for (i = 0; i < n2; i++) {
                int j = 0;
                int count = 0;
                if (s2.charAt(i) == s1.charAt(j)) {
                    temp1 = i;
                    while (j < n1 && temp1 < n2) {
                        if (s2.charAt(temp1) == s1.charAt(j)) {
                            temp1++;
                            j++;
                            count++;
                        }
                    }
                    maxi = Math.max(maxi, count);
                    if (j == n1 || temp1 == n2) {
                        flag = false;
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.print(i + " ");
                System.out.print(maxi);
            }
        }

    }

    public static void main(String[] args) {
        String str1 = "practicegeeks";
        String str2 = "coderpractice";
        longestCommonPrefix(str1, str2);
    }
}