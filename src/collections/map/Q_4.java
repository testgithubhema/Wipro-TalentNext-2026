package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q_4 {

    public static void main(String[] args) {

        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Rahul", 987654321);
        contactList.put("Priya", 912345678);
        contactList.put("Kiran", 998877665);

        System.out.println(contactList.containsKey("Rahul"));
        System.out.println(contactList.containsValue(912345678));

        Iterator<Map.Entry<String, Integer>> it = contactList.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}