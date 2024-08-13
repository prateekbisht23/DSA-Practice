public class Palindrome {
    /* static void palindrome(int num, int rev, int aux){
        if(aux == 0){
            if(rev == num){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
            return;
        }
        palindrome(num, (rev*10) + (aux%10), aux/10);
    } */
    static boolean palindrome(int num, int rev, int aux){
        if(aux == 0){
            return num == rev;
        }
        return palindrome(num, (rev*10) + (aux%10), aux/10);
    }
    public static void main(String[] args) {
        int num = 12321, rev = 0;
        System.out.println(palindrome(num, rev, num));
    }
}