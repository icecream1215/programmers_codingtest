//https://school.programmers.co.kr/learn/courses/30/lessons/12900
class Solution {
    public int solution(int n) {
        int[] pi = new int[n+1];

        pi[0] = 0;
        pi[1] = 1;
        pi[2] = 2;

        int num = 3;
        while(num <= n){
            pi[num] = (pi[num-1] + pi[num-2])%1000000007;
            num++;
        }
        return pi[n];
    }
}