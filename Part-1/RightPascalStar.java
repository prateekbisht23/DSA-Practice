public class RightPascalStar {
    public static void main(String[] args) {
        int n=8;
        for(int i=0; i<n/2; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=n/2; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
