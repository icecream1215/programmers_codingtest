//https://school.programmers.co.kr/learn/courses/30/lessons/42626
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int sco : scoville){
            queue.add(sco);
        }
        while(queue.peek() < K){
            if(queue.size() < 2)
                return -1;
            int newItem = queue.poll() + (queue.poll()*2);
            queue.add(newItem);
            answer++;
        }

        return answer;
    }
}