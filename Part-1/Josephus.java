import java.util.ArrayList;

public class Josephus {

    static int josephus(ArrayList<Integer> arr, int start, int k){
        if(arr.size() == 1){
            return arr.get(0);
        }
        start = (start+k) % arr.size();
        arr.remove(start-1);
        start++;
        return josephus(arr, start, k);
    }

    static int josephus(int n, int k){
        if(n == 1)return 0;
        return ((josephus(n-1,k) + k-1) % n);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,3);
        arr.add(3,4);
        arr.add(4,5);
        System.out.println(josephus(arr, 0, 3));
    }
}



/* 

Josephus( list , start , k){
   if list.size = 1
       return list[0]
   start = (start + k) % list.size
   list.remove( start )
   return Josephus( list, start, k)
}

*/