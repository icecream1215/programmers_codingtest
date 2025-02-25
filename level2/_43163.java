//https://school.programmers.co.kr/learn/courses/30/lessons/43163
import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        queue.offer(begin);

        while(!queue.isEmpty()){
            answer++;
            int queueSize = queue.size();
            for(int k = 0; k < queueSize; k++){
                String queueWord = queue.poll();
                for(int i = 0; i < words.length; i++){
                    String word = words[i];
                    if(!visited[i]){
                        int diffCnt = 0;
                        for(int j = 0; j < word.length(); j++){
                            if(queueWord.charAt(j) != word.charAt(j))
                                diffCnt++;
                            if(diffCnt > 1)
                                break;
                        }
                        if(diffCnt == 1){
                            if(target.equals(word))
                                return answer;
                            queue.offer(word);
                            visited[i] = true;
                        }
                    }
                }
            }
        }
        return 0;
    }
}