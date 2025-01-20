//https://school.programmers.co.kr/learn/courses/30/lessons/12911

class Solution {
    public int solution(int n) {
        int cnt_1 = Integer.bitCount(n);

        while(true){
            n++;
            if(cnt_1 == Integer.bitCount(n))
                break;
        }
        return n;
    }
}