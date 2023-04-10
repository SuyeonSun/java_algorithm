package Programmers.L1;

import java.util.HashMap;
import java.util.Map;

// Map: key를 통해 value 얻음
public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "Suyeon");
        map.put("job", "developer");

        String name = map.get("name");
        System.out.println(name);

        System.out.println(map.keySet());
        for (String key: map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.values());
        for (String val: map.values()) {
            System.out.println(val);
        }
    }
}
