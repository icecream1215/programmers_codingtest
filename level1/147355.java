//https://school.programmers.co.kr/learn/courses/30/lessons/147355

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_length = p.length();
        for(int i=0; i<(t.length()-p_length+1); i++){
            if(Long.parseLong(t.substring(i,i+p_length)) <= Long.parseLong(p))
                answer++;
        }
        return answer;
    }
}