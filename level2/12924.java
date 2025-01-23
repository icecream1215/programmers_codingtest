//https://school.programmers.co.kr/learn/courses/30/lessons/12924
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = (int)n/2; i > 0; i--){
            if(calculateNumber(n, i) == 0)
                answer++;
        }
        return answer+1;
    }

    private int calculateNumber(int n, int nextNum){
        if(n <= 0)
            return n;
        return calculateNumber(n-nextNum, nextNum+1);
    }
}