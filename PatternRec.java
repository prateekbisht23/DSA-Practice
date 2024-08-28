public class PatternRec{

    /* static void coulumn(int n){
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
        row(n-1);
        coulumn(n);
        System.out.println();
    } */






    /* static void stars(int n){
        if(n == 0){
            return;
        }
        System.out.print("* ");
        stars(n-1);

    }

    static void spaces(int n){
        if(n>1){
            System.out.print("  ");
            spaces(n-1);
        }
    }

    static void row(int n){
        helper(n, n);
    }

    static void helper(int n, int i){
        if(n == 0){
            return;
        }
        spaces(n);
        stars(2*(i-n)+1);
        System.out.println();
        helper(n-1, i);
    } */



    static void stars(int n){
        if(n == 0){
            return;
        }
        System.out.print("* ");
        stars(n-1);

    }

    static void spaces(int n){
        if(n>1){
            System.out.print("  ");
            spaces(n-1);
        }
    }

    static void row(int n){
        helper(n, n);
    }

    static void helper(int n, int i){
        if(n == 0){
            return;
        }
        helper(n-1, i);
        spaces(n);
        stars(2*(i-n)+1);
        System.out.println();
    }
    



    public static void main(String[] args) {
        int n = 5;

        row(n);

    }
}