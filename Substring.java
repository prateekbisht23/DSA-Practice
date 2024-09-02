
import java.util.ArrayList;

public class Substring {

    static void printSub(String str, String result){
        if(str.length() == 0){
            System.out.print(result+", ");
            return;
        }

        printSub(str.substring(1), result);
        printSub(str.substring(1), result + str.charAt(0));

    }


    static ArrayList substring(String word){
        if(word.length() == 0){
            ArrayList<String> subStrings = new ArrayList<>();
            subStrings.add("");
            return subStrings;
        }


        char current = word.charAt(0);
        String remaining = word.substring(1);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> temp = substring(remaining);


        for(String s : temp){
            result.add(s);
            result.add(current+s);
        }

        return result;
    }

    public static void main(String[] args) {

        String word = "abc";

        //System.out.println(substring(word));

        printSub(word, "");
        
        
        //ArrayList<String> subString = new ArrayList<>();

    }
}
