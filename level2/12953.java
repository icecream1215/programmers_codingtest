//https://school.programmers.co.kr/learn/courses/30/lessons/12953

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        int multi = 1;

        while(true){
            boolean allPass = true;
            answer = arr[arr.length-1] * multi;
            for(int i=0; i<arr.length-1; i++){
                if(answer%arr[i]!=0){
                    multi++;
                    allPass = false;
                    break;
                }
            }
            if(allPass)
                break;
        }
        return answer;
    }
}