

public class Sorting {

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,0,4,3,0,1};
        int i=0, j=arr.length-1;

        while(i<j){
            if(arr[i] > arr[j]){
                swap(arr, i, j);
                if(arr[i] == 0){
                    i+=1;
                }
                if(arr[i+1] < arr[j]){
                    j-=1;
                }
            }
            else if(arr[i] == 0){
                i+=1;
            }
            else{
                i+=1;
                j-=1;
            }
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
