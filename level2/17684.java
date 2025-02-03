//https://school.programmers.co.kr/learn/courses/30/lessons/17684
import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> dic = new HashMap<>();
        int newNum = 1;
        for(int i=0; i<26; i++){
            dic.put(String.valueOf((char)('A'+i)), newNum);
            newNum++;
        }

        int index = 0;
        while(index < msg.length()){
            int lastIndex = index+1;
            String word = msg.substring(index,lastIndex);
            while(lastIndex <= msg.length() && dic.containsKey(msg.substring(index,lastIndex))){
                word = msg.substring(index,lastIndex);
                lastIndex++;
            }

            list.add(dic.get(word));
            if(lastIndex <= msg.length()){
                dic.put(msg.substring(index,lastIndex), newNum++);
            }
            index += word.length();
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}