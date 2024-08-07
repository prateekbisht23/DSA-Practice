public class Fibbo {
    public static void main(String[] args) {
        int n=8;
        System.out.print("0 1 1");
        int a1=1, a2=2;
        for(int i=3; i<n; i++){
            int t = a1 + a2;
            System.out.print(" "+t);
            a1 = a2;
            a2 = t;
        }
    }
}
