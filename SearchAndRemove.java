public class SearchAndRemove {
    static String searchAndRemove(String word,char search){
        //return helper(word, search, replace, 0, 0);
        if(word.length() == 0){
            return "";
        }
        if(word.charAt(0) == search){
            return searchAndRemove(word.substring(1), search);
        }
        else{
            return word.charAt(0) + searchAndRemove(word.substring(1), search);
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
        String word = "Pratezek";
        System.out.println(searchAndRemove(word, 'z'));
    }
}
