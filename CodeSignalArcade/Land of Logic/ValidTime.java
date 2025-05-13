//Check if the given string is a correct time representation of the 24-hour clock.

import java.util.regex.Pattern;

public class ValidTime {

    public static boolean usingRegex(String time){

        String rgx = "^([0-1][0-9]|2[0-3]):([0-5][0-9])$";
        if(Pattern.matches(rgx, time)){
            return true;
        }

        return false;

    }


    public static void main(String[] args) {
        String time = "20:59";
        System.out.println(usingRegex(time));
        
    }
}