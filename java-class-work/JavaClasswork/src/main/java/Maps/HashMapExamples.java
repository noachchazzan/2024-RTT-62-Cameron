package Maps;

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("key1", "value1");
        stringMap.put("key2", "value2");
        stringMap.put("key3", "value3");
        stringMap.put("key4", "value4");
        stringMap.put(null, "value5"); // this is add a null a 2nd time which will  the existing value

        stringMap.put("key", "value 1234");
        String valueN = stringMap.get("key1");
        for (String key : stringMap.keySet()) {
            System.out.println(key + ": " + stringMap.get(key));
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(0,"tevin");
        Map<Boolean, List<String>> map2 = new HashMap<>();

        // This happens when working with ad hoc queries
        List<Map<String, Object>> queryResult;
    }
}
