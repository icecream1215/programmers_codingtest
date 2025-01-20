//https://school.programmers.co.kr/learn/courses/30/lessons/70129

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            for(char ch : s.toCharArray()){
                if(ch == '0')
                    answer[1]++;
            }
            s = Integer.toString(s.replaceAll("0", "").length(),2);
            answer[0]++;
        }
        return answer;
    }
}