
import java.util.Arrays;

//return all the indexes where that element is found

public class ArraySearch2 {
    static int[] arraySearch(int arr[], int ind,int found, int searchVal){
        if(ind == arr.length){
            int arr2[] = new int[found];
            /* if(arr2[0] == 0){
                System.out.println("Value not found");
            } */
            return arr2;
        }
        if(searchVal == arr[ind]){
            found++;
        }
        int temp[] = arraySearch(arr, ind+1, found, searchVal);
        if(searchVal == arr[ind]){
            temp[found-1] = ind;
            return temp;
        }
        return temp;
    }

    /* static void arraySearch(int arr[], int ind, int searchVal, int tempArr[]){
        if(ind == arr.length){
            System.out.println(tempArr);
            return;
        }
        if(arr[ind] == searchVal){
            tempArr[tempArr.length] = 
        }
        arraySearch(arr, ind+1, searchVal, tempArr);
    } */

    public static void main(String[] args) {
        int arr[] = {1,10,1,10,3};
        System.out.println(Arrays.toString(arraySearch(arr, 0, 0, 10)));
    }
}
