
import java.util.Arrays;

public class CountPveNve{
    static void countPveNve(int arr[], int i, int count[]){
        if(i == arr.length){
            System.out.println(Arrays.toString(count));
            return;
        }
        if(arr[i] < 0){
            count[0] += 1;
            countPveNve(arr, i+1, count);
        }
        else{
            count[1] += 1;
            countPveNve(arr, i+1, count);
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1, -2, 3, -5, 7};
        int count[] = new int[2];
        countPveNve(arr, 0, count);
    }
}