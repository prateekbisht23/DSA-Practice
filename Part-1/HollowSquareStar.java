import java.util.Scanner;

public class HollowSquareStar {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n;
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            for(int i = 0; i<n; i++){
                if(i == 0 || i == n-1){
                    for(int j=0; j<n; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                else{
                    for(int j=0; j<n; j++){
                        if(j == 0 || j == n-1){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}
