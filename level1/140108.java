//https://school.programmers.co.kr/learn/courses/30/lessons/140108

class Solution {
    public int solution(String s) {
        int same_cnt = 0;
        int diff_cnt = 0;
        int answer = 0;
        char first_spell = s.charAt(0);
        for(int i = 0; i < s.length(); i++) {
            if (first_spell == s.charAt(i)) {
                same_cnt++;
            } else {
                diff_cnt++;
            }

            if (same_cnt == diff_cnt){
                answer++;
                same_cnt = 0;
                diff_cnt = 0;
                if(i+1 < s.length())
                    first_spell = s.charAt(i+1);
            } else if (i == s.length()-1){
                answer++;
            }
        }
        return answer;
    }
}