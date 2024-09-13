import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {


    /* static boolean findInteger(int i, ArrayList<Integer> arr, int idx){
        if(idx == arr.size()){
            return false;
        }
        if(i == arr.get(idx)){
            return true;
        }
        return findInteger(i, arr, idx+1);
    } */


    /* static ArrayList<ArrayList<Integer>> permutations(int[] arr, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> finalList, int idx){
        if(idx == arr.length){
            list.remove(list.size()-1);
            return finalList;
        }
        
        for(int i=0; i<arr.length; i++){
            if(!findInteger(arr[i], list, 0)){
                list.add(arr[i]);
                permutations(arr, list , finalList, idx+1);
            }
            permutations(arr, list, finalList, idx+1);
        }
        
        if(list.size() == arr.length){
            finalList.add(list);
        }

        return finalList;

    } */


    static boolean notIn(int[] arr, int n, int idx){
        if(idx == arr.length){
            return true;
        }
        if(n == arr[idx]){
            return false;
        }
        return notIn(arr, n, idx+1);
    }

    static List<List<Integer>> helper(int[] nums, ArrayList<Integer> temp, int i){
        if(temp.size() == nums.length){
            List<List<Integer>> main = new ArrayList<>();
            main.add(temp);
            return main;
        }
        if(i == nums.length){
            List<List<Integer>> main = new ArrayList<>();
            return main;
        }
        if(notIn(nums, nums[i], i)){
            temp.add(nums[i]);
            helper(nums, temp, i+1);
        }
        temp.remove(temp.size()-1);
        return helper(nums, temp, i);
    }

    static List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        return helper(nums, temp ,0);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //System.out.println(findInteger(5, arr, 0));

        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();


        System.out.println(test);



        System.out.println(
            permute(arr)
        );

    }
}
