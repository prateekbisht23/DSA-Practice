public class LongestSubarray{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 7;
        int max = 0;
        int sum = 0;
        int left = 0;

        for(int right = 0; right<arr.length; right++){
            sum += arr[right];
            while(sum > target){
                sum -= arr[left];
                left++;
            }

            int subArrayLen = right - left + 1;
            max = Math.max(max, subArrayLen);
        }

        System.out.println(max);

    }
}