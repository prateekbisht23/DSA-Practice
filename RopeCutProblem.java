public class RopeCutProblem {


    static int ropeCutProblem(int l, int a, int b, int c){
        if(l == 0)return 0;
        if(l < 0)return -1;
        int cutA = ropeCutProblem(l-a, a, b, c);
        int cutB = ropeCutProblem(l-b, a, b, c);
        int cutC = ropeCutProblem(l-c, a, b, c);

        int max = Math.max(cutA, Math.max(cutB, cutC));

        if(max == -1) return -1;

        return max + 1;
    }

    /* static void ropeCutProblem(int l, int a, int b, int c, int max, int count){
        if(l == 0){
            System.out.println(max);
            return;
        }

    } */

    public static void main(String[] args) {
        int len = 5, a = 3, b = 6, c = 4;
        System.out.println(ropeCutProblem(len, a, b, c));
    }
}
