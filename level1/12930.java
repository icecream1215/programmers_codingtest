//https://school.programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean b_first = true;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') {
                sb.append(" ");
                b_first = true;
            } else {
                if(b_first) {
                    sb.append(s.substring(i,i+1).toUpperCase());
                } else {
                    sb.append(s.substring(i,i+1).toLowerCase());
                }
                b_first = !b_first;
            }
        }
        return sb.toString();
    }
}