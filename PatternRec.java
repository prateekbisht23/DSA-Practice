public class PatternRec{

    static void coulumn(int n){
        if(n == 0){
            return;
        }
        System.out.print("* ");
        coulumn(n-1);

    }

    static void row(int n){
        if(n == 0){
            return;
        }
        System.out.println();
        coulumn(n) ;
        row(n-1);
    }

    public static void main(String[] args) {
        int n = 5;

        row(n);

    }
}