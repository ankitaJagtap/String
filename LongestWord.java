public class LongestWord{
    
    public static void main(String args[]){
        String text = "Ankita Mukund Jagtap";
        String[] str = text.split(" ");
        int maxLength = Integer.MIN_VALUE;
        String ans = "";
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