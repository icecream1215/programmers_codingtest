//https://school.programmers.co.kr/learn/courses/30/lessons/64065

import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length()-2);
        String[] arr = s.split("\\},\\{");
        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(String str : arr){
            for (String num : str.split(",")) {
                int n = Integer.parseInt(num);
                if (set.add(Integer.parseInt(num))) {
                    list.add(Integer.parseInt(num));
                }
            }
        }

        int[] answer = new int[set.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}