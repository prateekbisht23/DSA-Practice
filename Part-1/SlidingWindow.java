public class SlidingWindow{
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,8,6,7};
        int k = 3;
        int sum=0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        max = sum;

        for(int i=k; i<arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            if(sum > max){
                max = sum;
            }
        }
        
        System.out.println(max);
    }
}