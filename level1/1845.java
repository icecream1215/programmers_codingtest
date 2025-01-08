//https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        return Math.min(nums.length/2, map.size());
    }
}