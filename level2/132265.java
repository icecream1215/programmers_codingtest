//https://school.programmers.co.kr/learn/courses/30/lessons/132265

import java.util.HashMap;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> aMap = new HashMap<>();
        HashMap<Integer, Integer> bMap = new HashMap<>();

        for(int i=0; i < topping.length; i++){
            aMap.put(topping[i], aMap.getOrDefault(topping[i], 0)+1);
        }
        for(int i=0; i < topping.length-1; i++){
            aMap.put(topping[i], aMap.get(topping[i])-1);
            if(aMap.get(topping[i])==0)
                aMap.remove(topping[i]);
            bMap.put(topping[i], bMap.getOrDefault(topping[i], 0)+1);
            if(aMap.size() == bMap.size())
                answer++;
        }
        return answer;
    }
}

// 아래 코드가 더 효율적임(시간 더 짧게 걸림). 미리 토핑 개수 저장하고, HashSet으로 돌림
/*
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int[] rightCount = new int[topping.length];

        HashSet<Integer> tempSet = new HashSet<>();
        for (int i = topping.length - 1; i >= 0; i--) {
            tempSet.add(topping[i]);
            rightCount[i] = tempSet.size();
        }

        HashSet<Integer> aSet = new HashSet<>();
        for (int i = 0; i < topping.length - 1; i++) {
            aSet.add(topping[i]);
            if (aSet.size() == rightCount[i + 1]) {
                answer++;
            }
        }

        return answer;
    }
}*/