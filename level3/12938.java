//https://school.programmers.co.kr/learn/courses/30/lessons/12938

class Solution {
    public int[] solution(int n, int s) {
        int num = (int)s/n;
        if (num < 1)
            return new int[]{-1};

        int[] answer = new int[n];
        int reNum = s%n;
        int index = n-1;
        while(reNum > 0){
            answer[index--] = num+1;
            reNum--;
        }
        while(index >= 0){
            answer[index--] = num;
        }

        return answer;
    }
}