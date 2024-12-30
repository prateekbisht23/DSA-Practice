
import java.util.ArrayList;



public class Dice {

    /*static int[] dice(int len){
        if(len == 0){
            //ArrayList<int> list = new ArrayList<>();
            int arr[] = new int[6];
            return arr;
        }
        if(len == -1){
            int arr[] = new int[6];
            return arr;
        }

        int[] count1 = dice(len-1);
        int[] count2 = dice(len-2);
        int[] count3 = dice(len-3);
        int[] count4 = dice(len-4);
        int[] count5 = dice(len-5);
        int[] count6 = dice(len-6);

        arr[1] += count1;
        arr[2] += count2;
        arr[3] += count3;
        arr[4] += count4;
        arr[5] += count5;
        arr[6] += count6;



    }*/


    static ArrayList<String> dice(int start, int end){

        if(start == end){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(start > end){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        ArrayList<String> finalList = new ArrayList<>();
        
        for(int dice=1; dice <= 6; dice++){
            ArrayList<String> list = dice(start+dice, end);

            for(String l : list){
                finalList.add(l + dice);
            }
        }

        return finalList;

    }
    

    public static void main(String[] args) {
        System.out.println(dice(0, 3));
    }
}
