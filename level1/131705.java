//https://school.programmers.co.kr/learn/courses/30/lessons/131705

import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        Arrays.sort(number);
        for(int i = 0; i<number.length-2; i++){
            for(int j = i+1; j<number.length-1; j++){
                for(int k = j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k] == 0)
                        answer++;
                }
            }
        }
        return answer;
    }
}