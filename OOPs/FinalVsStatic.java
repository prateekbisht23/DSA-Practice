// OPEN CLOSED Priciple - Class should be OPEN for inheritance and CLOSED for modification

class H extends FinalVsStatic{
    /* void disp(){

    } */
}

/*
final - prevent variable to modify
final - prevent class inheritance
final - prevent method overriding
final - 
*/

//final class can't be inherit
// public final class FinalVsStatic {
public class FinalVsStatic {
    static int t;
    final int j;
    FinalVsStatic(){
        j = 10;
    }

    final void disp(){

    }


    public static void main(String[] args) {
        final int MAX = 100; // Local var
        final int MIN_CAP = 1;
        final int arr[] = {10,20};
        arr[0]++;

        //arr = new int[10];
        //MAX++;
    }
}
