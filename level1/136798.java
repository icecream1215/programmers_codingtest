//https://school.programmers.co.kr/learn/courses/30/lessons/136798

class Solution {
    public int solution(int number, int limit, int power) {
        int total = 0;

        for(int i=1; i<=number; i++){
            int cnt = 0;
            for(int j=1; j*j<=i; j++){
                if(j*j==i)
                    cnt++;
                else if(i%j==0)
                    cnt += 2;
            }
            total += cnt>limit ? power :cnt;
        }
        return total;
    }
}