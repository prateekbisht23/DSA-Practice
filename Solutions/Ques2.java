package Solutions;
public class Ques2 {
    public static void main(String[] args) {
        for(int i = 0; i < args[0].length(); i++){
            System.out.println(args[0].substring(0, i+1));
        }
    }
}
