public class HollowTriangle {


    static void stars(int n, int arb, int last){
        if(arb == 0){
            return;
        }
        if(n == last){
            System.out.print("* ");
            stars(n, arb-1, last);
        }
        else if(arb == n || arb == 1){
            System.out.print("* ");
            stars(n, arb-1, last);
        }else{
            System.out.print("  ");
            stars(n, arb-1, last);
        }

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
        stars(2*(i-n)+1, 2*(i-n)+1, 2*i-1);
        System.out.println();
        helper(n-1, i);
    }


    public static void main(String[] args) {
        row(18);
    }
}
