package Programmers.L1;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public static void main (String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }

        for (int i=0; i< callings.length; i++) {
            int j = map.get(callings[i]);
            String temp = players[j-1];
            players[j-1] = players[j];
            players[j] = temp;
            map.put(players[j-1], j-1);
            map.put(players[j], j);
        }
    }
}
