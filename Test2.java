
public class Test2 {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println(sc); */


        int arr[] = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

        System.out.println("\n");

        int i=0, j=4;
        while(i <= j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i++;
            j--;
        }

        for(int k=0; k<5; k++){
            System.out.println(arr[k]);
        }
    }
}
