public class BinarySearch {
    
    public static void binarySearch(int[] arr, int key, int low, int high){
        if(low>high){
            System.out.println("No such element found");
            return;
        }
        if(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
               System.out.println(key + " found at index " + mid);
            }
            else if(arr[mid] > key){
               binarySearch(arr, key, low, mid-1);
            }
            else{
               binarySearch(arr, key, mid+1, high);
            }
        }

    }
    
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 20;

        int low = 0;
        int high = arr.length-1;
        
        binarySearch(arr, key, 0, arr.length-1);


        /* while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid] == target){
                System.out.println(target + " found at index " + mid);
                break;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
 */

    }
}
