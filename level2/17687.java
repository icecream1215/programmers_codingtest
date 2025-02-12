//https://school.programmers.co.kr/learn/courses/30/lessons/17687

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder words = new StringBuilder();
        int num = 0;
        while(words.length() < t*m){
            String convertNum = Integer.toString(num++, n).toUpperCase();
            words.append(convertNum);
        }

        for(int i=0; i<t; i++){
            answer.append(words.charAt(i*m+p-1));
        }
        return answer.toString();
    }
}