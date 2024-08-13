

public class CountEvenOdd {

    static void count(int range,int result[]){
        if(range == 0){
            System.out.println("Even : "+result[0]);
            System.out.println("Odd : "+result[1]);
        }
    }

    static int[] count(int range){

        
        if(range == 0){
            int arr[] = new int[2];
            return arr;
        }

        int result[] = count(range-1);

        if(range % 2 == 0){
            result[0]++;
        }
        else{
            result[1]++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = count(5);
        System.out.println("Even : "+arr[0]);
        System.out.println("Odd : "+arr[1]);

    }
}



/*
 

       5    10

       (10-5+1)/2
       
       5 11

        (11 - 5)/2 +1





*/