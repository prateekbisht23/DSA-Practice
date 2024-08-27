public class HeartWithName {



    //  --*****---*****--
    //  -*******-*******-
    //  *****************
    //  *****N A M E*****
    //  -***************-
    //  --*************--
    //  ---***********---
    //  ----*********----
    //  -----*******-----
    //  ------*****------
    //  -------***-------
    //  --------*--------


    //  *****N A M E*****
    //  -***************-
    //  --*************--
    //  ---***********---
    //  ----*********----
    //  -----*******-----
    //  ------*****------
    //  -------***-------
    //  --------*--------


    //  *****************
    //  -***************-
    //  --*************--
    //  ---***********---
    //  ----*********----
    //  -----*******-----
    //  ------*****------
    //  -------***-------
    //  --------*--------


    
    
    //  - - - - * - - - -
    //  - - - * * * - - - 
    //  - - * * * * * - -
    //  - * * * * * * * -
    //  * * * * * * * * *

    public static void main(String[] args) {
        int n = 5;
        /* for(int i = 3; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            
            for(int k = 0; k<2*i-1; k++){
                System.out.print("* ");
            }
            
            for(int j=0; j<2*(n-i)-1; j++){
                System.out.print("  ");
            }

            for(int k = 0; k<2*i-1; k++){
                if(i == n && k == 2*i-2){
                    continue;
                }
                System.out.print("* ");
            }

            System.out.println();
        } */

        int n2 = 9;

        for(int i=0; i<n2; i++){
            for(int j = 0; j<i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<n2-i-1; k++){
                if(i==0){
                    
                }
                System.out.print("* ");
            }
            for(int k=0; k<n2-i; k++){
                System.out.print("* ");
            }
            for(int j = 0; j<i; j++){
                System.out.print("  ");
            }

            System.out.println();
        }


        /* for(int i=0; i<4*n-1; i+=2){
            for(int j=0; j<i/2; j++){
                System.out.print("- ");
            }
            for(int k=0; k<2*n-i-1; k++){
                if(i==0 && k==2*n-i-2){
                    continue;
                }
                System.out.print("* ");
            }

            System.out.println();
        } */
        
    }
}
