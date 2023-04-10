package Programmers.L1;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public static void main (String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int j = 0; j < callings.length; j++) {
            Integer idx = map.get(callings[j]); // 추월한 선수의 idx
            String temp = players[idx-1];
            players[idx-1] = players[idx];
            players[idx] = temp;
            map.put(players[idx-1], idx-1);
            map.put(players[idx], idx);
        }
    }
}
