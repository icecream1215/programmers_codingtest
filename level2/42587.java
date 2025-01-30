//https://school.programmers.co.kr/learn/courses/30/lessons/42587
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->b-a);
        Queue<Integer[]> queue = new LinkedList<>();

        int num = 0;
        for(int priority : priorities){
            priorityQueue.add(priority);
            queue.offer(new Integer[]{priority,num});
            num++;
        }

        while(priorityQueue.size() > 0){
            Integer[] arr = queue.poll();
            if(priorityQueue.peek() > arr[0]){
                queue.offer(arr);
            }else{
                priorityQueue.poll();
                count++;
                if(arr[1] == location)
                    break;
            }
        }
        return count;
    }
}