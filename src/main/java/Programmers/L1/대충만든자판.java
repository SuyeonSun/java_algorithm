package Programmers.L1;
import java.util.*;

public class 대충만든자판 {
    public static void main(String[] args) {
        String str = "springboot";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            map.put(str.charAt(i), i);
        }
        // map.containsKey('s');
        System.out.println(map.containsKey('s'));

        // String 배열인 경우, 원소의 출력
        String[] strArr = {"first", "second"};
        for (String string: strArr) {
            System.out.println(string);
        }
    }
}
