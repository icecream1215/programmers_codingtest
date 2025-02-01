//https://school.programmers.co.kr/learn/courses/30/lessons/17680
import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        for(String city : cities){
            city = city.toLowerCase();
            if(queue.contains(city)){
                queue.remove(city);
                answer += 1;
            }else{
                if(queue.size() >= cacheSize)
                    queue.poll();
                answer += 5;
            }
            if(cacheSize > 0)
                queue.offer(city);
        }
        return answer;
    }
}