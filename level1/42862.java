//https://school.programmers.co.kr/learn/courses/30/lessons/42862

import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> set_lost = new HashSet<Integer>();
        HashSet<Integer> set_reserve = new HashSet<Integer>();
        int answer = n-lost.length;
        Arrays.sort(lost);
        for(int number : lost){
            set_lost.add(number);
        }
        for(int number : reserve){
            set_reserve.add(number);
        }
        for (int num_lost : set_lost) {
            if(set_reserve.contains(num_lost)){
                set_reserve.remove(num_lost);
                answer++;
            }
            else if(set_reserve.contains(num_lost-1) && !set_lost.contains(num_lost-1)){
                set_reserve.remove(num_lost-1);
                answer++;
            }
            else if(set_reserve.contains(num_lost+1) && !set_lost.contains(num_lost+1)){
                set_reserve.remove(num_lost+1);
                answer++;
            }
        }
        return answer;
    }
}