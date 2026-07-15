package collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Q_3 {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");

        Iterator<Map.Entry<Object, Object>> it = p.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Object, Object> e = it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}