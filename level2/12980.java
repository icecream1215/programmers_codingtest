//https://school.programmers.co.kr/learn/courses/30/lessons/12980

public class Solution {
    public int solution(int n) {
        int count = 0;
        while(n>0){
            if(n%2==0)
                n=n/2;
            else{
                n-=1;
                count++;
            }
        }
        return count;
    }
}