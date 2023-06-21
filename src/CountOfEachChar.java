import java.util.HashMap;
import java.util.Map;

public class CountOfEachChar {

    public static void main(String[] args) throws InterruptedException {
        String s = "hello";

        char[] c = s.toCharArray();

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < c.length; i++) {

            if (charCount.containsKey(c[i])){

                charCount.put( c[i],charCount.get( c[i])+1);
            }else{
                charCount.put( c[i],1);

            }

        }
    }
}
