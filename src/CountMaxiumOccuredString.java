import java.util.*;

public class CountMaxiumOccuredString {
    public static void main(String[] args) {
        String s = new String("I neeed to check max occured char");
        char[] ch = s.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c:ch){
            if( map.containsKey(c)){
               map.put(c, map.get(c)+1) ;
            }else {
                map.put(c, 1);
            }

        }

        int maxValueInMap = Collections.max(map.values());

            System.out.println(maxValueInMap);

        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() == maxValueInMap) {

                // Print the key with max value
                System.out.println(entry.getKey());
            }
        }
    }


    }
