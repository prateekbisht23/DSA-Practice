public class LongestSubarrayLength {
    static void longestSubarrayLength(int arr[], int ind, int count, int max){
        if(ind == arr.length){
            System.out.println(max);
            return;
        }
        
        if(arr[ind - 1] == arr[ind]){
            count++;
            if(max <= count){
                max = count;
            }
        }
        else{
            count = 1;
        }
        longestSubarrayLength(arr, ind+1, count, max);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,3,5};

        longestSubarrayLength(arr, 1, 1, 0);
    }
}
