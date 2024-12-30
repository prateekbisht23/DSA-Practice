public class PowerOfHanoi {

    static void powerOfHanoi(int n, char source, char auxillary, char destination){
        if(n == 1){
            System.out.println("Moved disc 1 from "+ source + " to "+ destination);
            return;
        }
        
        powerOfHanoi(n-1, source, destination, auxillary);
        System.out.println("Moved disc "+ n + " from "+ source + " to "+ destination);
        powerOfHanoi(n-1, auxillary, source, destination);
    }

    public static void main(String[] args) {
        powerOfHanoi(3, 'A', 'B', 'C');
    }
}
