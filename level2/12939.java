//https://school.programmers.co.kr/learn/courses/30/lessons/12939

import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] arr_str = s.split(" ");
        int[] arr_num = new int[arr_str.length];
        for(int i = 0; i < arr_str.length; i++){
            arr_num[i] = Integer.parseInt(arr_str[i]);
        }
        Arrays.sort(arr_num);
        return arr_num[0] + " " + arr_num[arr_str.length-1];
    }
}