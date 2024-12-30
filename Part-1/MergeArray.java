
import java.util.Arrays;


public class MergeArray {
    static void mergeArray(int arr1[], int arr2[], int i1, int i2, int merge[], int m){
        if(m == merge.length){
            System.out.println(Arrays.toString(merge)); 
            return;
        }
        if(i1 == arr1.length){
            merge[m] = arr2[i2];
            mergeArray(arr1, arr2, i1, i2+1, merge, m+1);
        }
        else if(i2 == arr2.length){
            merge[m] = arr1[i1];
            mergeArray(arr1, arr2, i1+1, i2, merge, m+1);
        }
        else if(arr1[i1] <= arr2[i2]){
            merge[m] = arr1[i1];
            mergeArray(arr1, arr2, i1+1, i2, merge, m+1);
        } 
        else{
            merge[m] = arr2[i2];
            mergeArray(arr1, arr2, i1, i2+1, merge, m+1);
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,4,7};
        int arr2[] = {2,3,5};   
        int merge[] = new int[6];
        mergeArray(arr1, arr2, 0, 0, merge, 0);
    }
}
