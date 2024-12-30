
import java.util.Arrays;

public class AddDigitsArray {
    
    static int addDigit(int i){
        if(i == 0){
            return 0;
        }
        return addDigit(i/10) + (i%10);
    }

    static void addDigitsArray(int arr[], int i){
        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = addDigit(arr[i]);
        addDigitsArray(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {123,234,345};
        addDigitsArray(arr, 0);
    }
}
