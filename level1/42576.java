// https://school.programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;

class Solution {
    public String solution(String[] participants, String[] completions) {
        String answer = "";

        HashMap<String,Integer> map = new HashMap<>();
        
        for (String participant : participants){
            if(map.containsKey(participant)){
                map.put(participant, map.get(participant)+1);
            } else{
                map.put(participant, 1);            
            }
        }

        for (String completion : completions){
            if (map.get(completion) > 1){
                map.put(completion, map.get(completion)-1);            
            } else{
                map.remove(completion);
            }
        }
        
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            answer = key;
            break;
        }
        
        return answer;
    }
}