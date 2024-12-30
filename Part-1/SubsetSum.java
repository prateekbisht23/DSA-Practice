public class SubsetSum {

    static int countSubset(int[] arr, int target, int ind){
        if(target == 0){
            return 1;
        }
        if(ind == arr.length || target < 0){
            return 0;
        }

        return countSubset(arr, target- arr[ind], ind+1) + countSubset(arr, target, ind+1);
    }

    static int countSubset(int[] arr, int target, int ind, int sum){
        if(target == sum){
            return 1;
        }
        if(ind == arr.length){
            return 0;
        }
        
        return countSubset(arr, target, ind+1, sum) +  countSubset(arr, target, ind+1, sum+arr[ind]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 8, 9};
        int target = 15;

        int[] arr2 = {1 , 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 10;

        System.out.println(countSubset(arr, target, 0, 0));
        
    }
}
