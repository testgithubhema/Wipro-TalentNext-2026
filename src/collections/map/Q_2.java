package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q_2 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsValue("Tokyo"));

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}