

class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int tLen = t.length();
        int sLen = s.length();
        if(sLen == 0){
            return true;
        }else if(sLen > tLen){
            return false;
        }else{
            int i = 0;
            int j = 0;
            while(i < tLen && j < sLen){
                if(s.charAt(j) == t.charAt(i)){
                    j++;
                    i++;
                }else{
                    i++;
                }
            }
            if(j == sLen){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "anhbgfc";
        boolean result = isSubsequence(s,t);
        System.out.println(result);
    }
}