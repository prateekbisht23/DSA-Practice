public class SortedOrNot {
    /* static void isSorted(int arr[], int ind){
        if(ind == arr.length){
            System.out.println(true);
            return;
        }
        if(arr[ind] < arr[ind-1]){
            System.out.println(false);
            return;
        }
        isSorted(arr, ind+1);
    } */
    static boolean isSorted(int arr[], int ind){
        if(ind == arr.length){
            return true;
        }
        if(arr[ind] < arr[ind-1]){
            return false;
        }
        return isSorted(arr, ind+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,4,5,6,7};
        //isSorted(arr, 1);
        System.out.println(isSorted(arr, 1));
    }
}
