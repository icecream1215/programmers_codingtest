//https://school.programmers.co.kr/learn/courses/30/lessons/42586

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        boolean[] finish = new boolean[progresses.length];
        boolean[] deploay = new boolean[progresses.length];
        ArrayList<Integer> list = new ArrayList<>();
        int finishCount = 0;
        while(true){
            int deployCount = 0;
            for(int i = 0; i < progresses.length; i++){
                if(!deploay[i]){
                    if(!finish[i])
                        progresses[i] += speeds[i];
                    if(progresses[i]>=100){
                        if(!finish[i]){
                            finish[i] = true;
                            finishCount++;
                        }
                        if(checkFinish(finish, i)){
                            deployCount++;
                            deploay[i] = true;
                        }
                    }
                }
            }

            if(deployCount>0)
                list.add(deployCount);

            if(finishCount==progresses.length)
                break;
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    private boolean checkFinish(boolean[] finish, int num){
        for(int i = 0; i < num; i++){
            if(!finish[i])
                return false;
        }
        return true;
    }
}