public class PalindromeString {
    static Boolean palindrome(String word, int start, int end){
        if(start >= end){
            return true;
        }
        if(word.charAt(start) != word.charAt(end)){
            return false;
        }
        return palindrome(word, start+1, end-1);
    }
    public static void main(String[] args) {
        String name = "abcdcba";
        System.out.println(palindrome(name, 0, name.length()-1));
    }
}
