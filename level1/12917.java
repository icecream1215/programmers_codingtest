// https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb_upper = new StringBuilder();
        StringBuilder sb_lower = new StringBuilder();
        for (char temp : arr){
            if (Character.isUpperCase(temp))
                sb_upper.append(String.valueOf(temp));
            else
                sb_lower.append(String.valueOf(temp));
        }

        char[] arr_upper = sb_upper.toString().toCharArray();
        char[] arr_lower = sb_lower.toString().toCharArray();
        Arrays.sort(arr_upper);
        Arrays.sort(arr_lower);

        StringBuilder sb = new StringBuilder();
        sb.append(new String(arr_upper));
        sb.append(new String(arr_lower));
        return sb.reverse().toString();


        /*
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
        */
    }
}
