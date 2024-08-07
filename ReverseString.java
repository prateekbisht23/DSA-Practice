public class ReverseString {
    public static void main(String[] args) {
        String str = "Omisha";
        String strT = "";
        //char arr[] = str.toCharArray();
        /* for(int i=0; i < str.length(); i++){
            strT = arr[i] + strT;
        } */
        for(int i=str.length()-1; i >= 0 ; i--){
            strT += str.charAt(i);
        }
        System.out.println("Reversed String is - "+strT);
    }
}
