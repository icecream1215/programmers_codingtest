//https://school.programmers.co.kr/learn/courses/30/lessons/42748
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for(int[] command : commands){
            int[] arr = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(arr);
            answer[count] = arr[command[2]-1];
            count++;
        }
        return answer;
    }
}