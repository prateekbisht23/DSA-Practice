public class Kadence {
    public static void main(String[] args) {
        int arr[] = {-5, 5, 4, 3, -2, 9, 10};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        
        System.out.println(max);
    }
}
