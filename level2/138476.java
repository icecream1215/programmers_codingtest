//https://school.programmers.co.kr/learn/courses/30/lessons/138476

import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int size : tangerine){
            if(map.containsKey(size)){
                map.put(size, map.get(size)+1);
            }else{
                map.put(size, 1);
            }
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));
        for (int key : keys) {
            k -= map.get(key);
            answer++;
            if (k<=0) break;
        }
        return answer;
    }
}