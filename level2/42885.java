//https://school.programmers.co.kr/learn/courses/30/lessons/42885
import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int minIndex = 0;
        int maxIndex = people.length-1;
        Arrays.sort(people);
        while(minIndex<=maxIndex){
            if(people[minIndex]+people[maxIndex] > limit){
                answer++;
                maxIndex--;
            }else{
                answer++;
                minIndex++;
                maxIndex--;
            }
        }

        return answer;
    }
}