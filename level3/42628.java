//https://school.programmers.co.kr/learn/courses/30/lessons/42628
import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(String operation : operations){
            String word = operation.split(" ")[0];
            int num = Integer.parseInt(operation.split(" ")[1]);
            if(word.equals("I")){
                queue.add(num);
                reverseQueue.add(num);
            }else{
                if(!queue.isEmpty()){
                    if(num == 1){
                        int topNum = reverseQueue.peek();
                        reverseQueue.poll();
                        queue.remove(topNum);
                    }else{
                        int topNum = queue.peek();
                        queue.poll();
                        reverseQueue.remove(topNum);
                    }
                }
            }
        }

        if(!queue.isEmpty()){
            answer[0] = reverseQueue.poll();
            answer[1] = queue.poll();
        }
        return answer;
    }
}