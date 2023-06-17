import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CountMaxiumOccuredString {
    public static void main(String[] args) {
        String s = new String("I need to check max occured char");
        char[] ch = s.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c:ch){
            if(null!=map && map.containsKey(c)){
               map.put(c, map.get(c)+1) ;
            }
            map.put(c,1);

        }

        Optional<Map.Entry<Character, Integer>> maxEntry =
              map.entrySet().stream().max((i1,i2) -> i1.getValue().compareTo(i2.getValue()));

            System.out.println(maxEntry.get().getValue());
    }


    }
