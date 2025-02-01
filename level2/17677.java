//https://school.programmers.co.kr/learn/courses/30/lessons/17677

import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        String pattern = "^[a-z]+$";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(int i = 0; i < str1.length()-1; i++){
            String subStr = str1.substring(i, i+2);
            if(subStr.matches(pattern)){
                map1.put(subStr, map1.getOrDefault(subStr, 0) + 1);
            }
        }

        for(int i = 0; i < str2.length()-1; i++){
            String subStr = str2.substring(i, i+2);
            if(subStr.matches(pattern)){
                map2.put(subStr, map2.getOrDefault(subStr, 0) + 1);
            }
        }

        int uniCount = 0;
        int interCount = 0;
        for(String key : map1.keySet()){
            if(map2.containsKey(key)){
                uniCount += Math.max(map1.get(key), map2.get(key));
                interCount += Math.min(map1.get(key), map2.get(key));
                map2.remove(key);
            }else{
                uniCount += map1.get(key);
            }
        }
        for(String key : map2.keySet()){
            uniCount += map2.get(key);
        }

        if(interCount == 0 && uniCount == 0){
            interCount = 1;
            uniCount = 1;
        }

        return (int)((double)interCount/uniCount*65536);
    }
}