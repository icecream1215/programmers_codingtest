//https://school.programmers.co.kr/learn/courses/30/lessons/12927
import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works){
            queue.add(work);
        }

        while(n > 0){
            int num = queue.poll();
            if(num == 0)
                break;
            queue.add(num-1);
            n--;
        }

        while(!queue.isEmpty()){
            answer += Math.pow(queue.poll(), 2);
        }

        return answer;
    }
}