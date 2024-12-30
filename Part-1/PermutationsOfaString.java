import java.util.ArrayList;

public class PermutationsOfaString {
    //Homework

    /* static void permutations(String str, String result, int end){
        if(str.length() == 0){
            System.out.println(result+" ");
            return;
        }
        permutations(str.substring(1), result + str.charAt(0), end);
        permutations(str.substring(0, end-2), result + str.charAt(end), end-1);
    }


    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "",str.length()-1);
    } */




   
    static void generatePermutations(String str, String mid, ArrayList<String> result) {
       if (str.length() == 0) {
           result.add(mid);
        }
        for (int i = 0; i < str.length(); i++) {
            // Choose the current character and recursively permute the remaining characters
            String newMid = mid + str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, newMid, result);
        }
    
    }
    
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = new ArrayList<>();
        generatePermutations(str, "", result);
        System.out.println(result);
    }


}

