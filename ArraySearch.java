public class ArraySearch {
    static void arraySearch(int arr[], int ind, int searchVal){
        if(arr[ind] == arr.length){
            System.out.println("Value not found");
            return;
        }
        if(searchVal == arr[ind]){
            System.out.println("Found at "+(ind+1)+" place!!");
            return;
        }
        arraySearch(arr, ind+1, searchVal);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        arraySearch(arr, 0, 10);
    }
}
