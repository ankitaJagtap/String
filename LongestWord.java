import java.util.*;
import java.lang.*;

public class LongestWord{
    
    public static void main(String args[]){
        String text = "Ready, steady, go!";
        String[] str = text.split(" ");
        int maxLength = Integer.MIN_VALUE;
        String ans = "";
        Arrays.sort(str, Collections.reverseOrder());
        int n1 = str.length;

        System.out.println(str[0]);

        for(String name: str){
            int n = name.length();
            if(n > maxLength){
                maxLength = n;
                ans = name;
            }
        }

        System.out.println(ans);
    }


}