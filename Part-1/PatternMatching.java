public class PatternMatching{
    public static void main(String[] args) {
        String text = "abcabdabcabe";
        String pattern = "cab";
        int textHash = 0;
        int patternHash = 0;

        for(int i=0; i<pattern.length(); i++){
            int ascii = pattern.charAt(i);
            patternHash += ascii;
            textHash += text.charAt(i);
        }

        for(int i=0; i<=text.length()-pattern.length(); i++){
            if(textHash == patternHash){
                if(text.substring(i, i+pattern.length()).equals(pattern)){
                    System.out.println("Pattern Found at "+i);
                }
            }

            if(i<text.length() - pattern.length()){
                textHash = textHash - text.charAt(i) + text.charAt(i+pattern.length());
            }
        }

    }
}