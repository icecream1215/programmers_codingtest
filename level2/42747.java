//https://school.programmers.co.kr/learn/courses/30/lessons/42747
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int totalCount = want.length;
        HashMap<String, Integer> wantMap = new HashMap<>();
        HashMap<String, Integer> 10dayMap = new HashMap<>();

        for(int i = 0; i < totalCount; i++){
            wantMap.put(want[i], wantMap.getOrDefault(want[i], 0)+1);
        }

        for(int i=0; i<disount.length; i++){
            if(10dayMap.size() >= totalCount)
            10dayMap.put(disount[i-totalCount],
                    10dayMap.get(disount[i-totalCount])-1);

            10day_map.put(disount[i], 10day_map.getOrDefault(disount[i], 0)+1);

            if(10dayMap.size() >= totalCount){
                if(check10DayItem(10dayMap, wantMap))
                    return i-totalCount+2;
            }
        }
        return 0;
    }

    private boolean check10DayItem(HashMap<> 10dayMap, HashMap<> wantMap){
        for(String key : wantMap.keySet()){
            if(wantMap.get(key) != 10dayMap.get(key))
            return false;
        }
        return true;
    }
}