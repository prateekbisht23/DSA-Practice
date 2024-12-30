public class ReverseStringRec {
    static String reverseStringRec(String word){
        /* if(word.equals("")){
            return "";
        } */
        if(word.length() == 0){
            return "";
        }
        return reverseStringRec(word.substring(1)) + word.charAt(0);
    }
    public static void main(String[] args) {
        String name = "Prateek";
        System.out.println(reverseStringRec(name));
    }
}
