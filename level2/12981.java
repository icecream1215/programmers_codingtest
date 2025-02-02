//https://school.programmers.co.kr/learn/courses/30/lessons/12981
import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        char ch = words[0].charAt(words[0].length()-1);
        for(int i = 1; i < words.length; i++){
            if(set.contains(words[i]) || ch != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
            set.add(words[i]);
            ch = words[i].charAt(words[i].length()-1);
        }
        return answer;
    }
}