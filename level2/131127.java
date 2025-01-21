//https://school.programmers.co.kr/learn/courses/30/lessons/131127

import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int totalCount = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        HashMap<String, Integer> tenDayMap = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
            totalCount += number[i];
        }

        for(int i=0; i<discount.length; i++){
            if(i >= totalCount){
                tenDayMap.put(discount[i-totalCount],
                        tenDayMap.get(discount[i-totalCount])-1);
                if(tenDayMap.get(discount[i-totalCount])==0){
                    tenDayMap.remove(discount[i-totalCount]);
                }
            }
            tenDayMap.put(discount[i], tenDayMap.getOrDefault(discount[i], 0)+1);

            if(i >= totalCount-1 && tenDayMap.size() == wantMap.size()){
                if(check10DayItem(tenDayMap, wantMap)){
                    answer++;
                }
            }
        }
        return answer;
    }

    private boolean check10DayItem(HashMap<String, Integer> tenDayMap, HashMap<String, Integer> wantMap){
        for(String key : wantMap.keySet()){
            if(wantMap.get(key) != tenDayMap.get(key)){
                return false;
            }
        }
        return true;
    }
}