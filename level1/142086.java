//https://school.programmers.co.kr/learn/courses/30/lessons/142086

import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String spell = String.valueOf(s.charAt(i));
            if(map.containsKey(spell)){
                answer[i] = i-map.get(spell);
                map.put(spell, i);
            }else{
                map.put(spell, i);
                answer[i] = -1;
            }
        }
        return answer;
    }
}