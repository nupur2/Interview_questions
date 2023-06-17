import java.util.Map;
import java.util.TreeMap;

public class TreeMApTest {
    public static void main(String[] args)
    {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("nupur", 1);
        treeMap.put("nehaa",2);
        treeMap.put("nupur",3);
        System.out.println(treeMap);
    }
}
