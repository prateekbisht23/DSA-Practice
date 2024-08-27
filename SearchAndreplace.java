public class SearchAndreplace {
    static String searchAndReplace(String word,char search, char replace){
        //return helper(word, search, replace, 0, 0);
        if(word.length() == 0){
            return "";
        }
        if(word.charAt(0) == search){
            return replace + searchAndReplace(word.substring(1), search, replace);
        }
        else{
            return word.charAt(0) + searchAndReplace(word.substring(1), search, replace);
        }
    }
    /* static String helper(String word, char search, char replace, int i, int replaceInd){
        if(i == word.length()){
            return "";
        }
        else if(search == word.charAt(i)){
            replaceInd = i;
        }
        else{

        }
        return helper(word, search, replace, i+1, replaceInd);
    } */
    public static void main(String[] args) {
        String word = "Pratzek";
        System.out.println(searchAndReplace(word, 'z', 'e'));
    }
}
