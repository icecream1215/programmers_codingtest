//https://school.programmers.co.kr/learn/courses/30/lessons/87390

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];

        for(int i = 0; i < answer.length; i++){
            int x = (int)((left+i)/n);
            int y = (int)((left+i)%n);
            answer[i] = Math.max(x,y) + 1;
        }

        return answer;
    }
}