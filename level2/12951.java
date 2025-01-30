//https://school.programmers.co.kr/learn/courses/30/lessons/12951

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(i==0 || s.charAt(i-1) == ' '){
                answer.append(String.valueOf(s.charAt(i)).toUpperCase());
            }else{
                answer.append(String.valueOf(s.charAt(i)));
            }
        }
        return answer.toString();
    }
}