//https://school.programmers.co.kr/learn/courses/30/lessons/152996
import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int weight : weights){
            map.put(weight, map.getOrDefault(weight, 0)+1);
        }

        for(int weight : weights){
            map.put(weight, map.get(weight)-1);

            if(map.containsKey(weight)){ // 1:1
                answer += map.get(weight);
            }

            if(weight%2==0 && map.containsKey(weight*3/2)){ // 2:3
                answer += map.get(weight*3/2);
            }
            if(map.containsKey(weight*2)){ // 2:4
                answer += map.get(weight*2);
            }
            if(weight%3==0 && map.containsKey(weight*2/3)){ // 3:2
                answer += map.get(weight*2/3);
            }
            if(weight%3==0 && map.containsKey(weight*4/3)){ // 3:4
                answer += map.get(weight*4/3);
            }
            if(weight%2==0 && map.containsKey(weight/2)){ // 4:2
                answer += map.get(weight/2);
            }
            if(weight%4==0 && map.containsKey(weight*3/4)){ // 4:3
                answer += map.get(weight*3/4);
            }
        }
        return answer;
    }
}