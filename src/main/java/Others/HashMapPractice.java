package Others;
import java.util.*;

public class HashMapPractice {
    public static void main (String[] args) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            map.get(i).add("apple");
            System.out.println(map.get(i).toString());
        }

        for (int i = 0; i < 3; i++) {
            if (map.get(i).contains("apple")) {
                map.get(i).add("grape");
                System.out.println(map.get(i).toString());
            }
        }



    }
}
