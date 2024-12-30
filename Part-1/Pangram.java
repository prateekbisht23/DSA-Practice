
import java.util.HashMap;

public class Pangram {
    static HashMap<Character, Integer> alpha = new HashMap<Character, Integer>() {{
        put('a', 0);
        put('b', 0);
        put('c', 0);
        put('d', 0);
        put('e', 0);
        put('f', 0);
        put('g', 0);
        put('h', 0);
        put('i', 0);
        put('j', 0);
        put('k', 0);
        put('l', 0);
        put('m', 0);
        put('n', 0);
        put('o', 0);
        put('p', 0);
        put('q', 0);
        put('r', 0);
        put('s', 0);
        put('t', 0);
        put('u', 0);
        put('v', 0);
        put('w', 0);
        put('x', 0);
        put('y', 0);
        put('z', 0);
    }};
    static void pangram(String a, int i){
        if(i == a.length()){
            for(char c : alpha.keySet()){
                if(alpha.get(c) == 0){
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
            return;
        }
        alpha.put(a.charAt(i), 1);
        pangram(a, i+1);
    }
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        pangram(a, 0);
    }
}
