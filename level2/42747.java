//https://school.programmers.co.kr/learn/courses/30/lessons/42747
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int idx = 0;
        Arrays.sort(citations);
        if(citations[0] > citations.length)
            idx = citations[0];
        else if(citations[citations.length-1] > citations.length)
            idx = citations.length;
        else
            idx = citations[citations.length-1];

        for(int i = idx; i >= 0; i--){
            int overCount = 0;
            for(int citation : citations){
                if(i <= citation)
                    overCount++;
            }
            if(overCount>=i && citations.length-overCount <= i)
                return i;
        }
        return 0;
    }
}

//더 나은 코드
/*
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }
        return answer;
    }
}
*/