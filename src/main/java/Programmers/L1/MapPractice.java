package Programmers.L1;

import java.util.HashMap;
import java.util.Map;

// Map: key를 통해 value 얻음
public class MapPractice {
    public static void main(String[] args) {
        MapPractice ex = new MapPractice();
        ex.checkHashMap();
    }

    public void checkHashMap() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("people", "사람");
        map1.put("animal", "동물");
        System.out.println(map1);
        System.out.println(map1.get("people"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
