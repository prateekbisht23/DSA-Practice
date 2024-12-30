public class FibboRec {

    static int fibboRec(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return fibboRec(n-1) + fibboRec(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibboRec(6));
    }
}
