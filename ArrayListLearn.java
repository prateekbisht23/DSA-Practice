
import java.util.ArrayList;

public class ArrayListLearn {

    public static void main(String[] args) {
        //int[] arr = new int[5];  //General way of creating an array
        ArrayList<Integer> list = new ArrayList<>(5);

        
        for(int i=1 ; i<=10; i++ ){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
        
        list.remove(6);
        System.out.println(list);

        System.out.println(list.get(5));

    }
}
