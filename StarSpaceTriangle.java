public class StarSpaceTriangle{
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                if(j == i){
                    System.out.print("* ");
                    continue;
                }
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.err.println("");
        }
        for(int i=n-1; i>=0; i--){
            for(int j=n-i; j>0; j--){
                System.out.print("*");
            }
            for(int j=2*i; j>0; j--){
                if(j == i){
                    System.out.print("* ");
                    continue;
                }
                System.out.print(" ");
            }
            for(int j=n-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}