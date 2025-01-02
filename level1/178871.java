//https://school.programmers.co.kr/learn/courses/30/lessons/178871

import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i<players.length; i++){
            map.put(players[i], i);
        }

        for(String calling : callings){
            int call_num = map.get(calling);
            String prev_player = players[call_num-1];
            map.put(prev_player, map.get(prev_player)+1);
            map.put(calling, map.get(calling)-1);
            players[call_num-1] = calling;
            players[call_num] = prev_player;
        }

        return players;
    }
}