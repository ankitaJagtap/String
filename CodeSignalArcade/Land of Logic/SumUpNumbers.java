//returns the sum of numbers that appear in the given inputString.


public class SumUpNumbers {

    public static int sumUpNumbers(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", " ").trim();
        str = str.replaceAll("\\s+", " ");
        // System.out.println(str);
        String[] arr = str.split(" ");
        int sum = 0;
        for(String name: arr){
            if(name.matches("\\d+")){
                sum += Integer.parseInt(name);
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        String inputString = "2 apples,         12 oranges ";
        System.out.println(sumUpNumbers(inputString));
    }
}