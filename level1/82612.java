// https://school.programmers.co.kr/learn/courses/30/lessons/82612

class Solution {
    public long solution(int price, long money, int count) {
        long total = 0;

        for (int i = 0; i < count; i++) {
            total += price*(i+1);
        }

        return (total - money > 0) ? total - money : 0;
    }
}