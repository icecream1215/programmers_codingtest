//https://school.programmers.co.kr/learn/courses/30/lessons/12903

class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length()%2 == 0) { //짝수
            int num = s.length()/2;
            answer = s.substring(num-1,num+1);
        } else{
            int num = s.length()/2;
            answer = s.substring(num,num+1);
        }
        return answer;
    }
}
