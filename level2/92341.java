//https://school.programmers.co.kr/learn/courses/30/lessons/92341
import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, String> map = new HashMap<>();
        TreeMap<String, Integer> timeMap = new TreeMap<>();
        for(String record : records){
            String time = record.split(" ")[0];
            String carNumber = record.split(" ")[1];
            if(map.containsKey(carNumber)){
                int inTime = (Integer.parseInt(map.get(carNumber).split(":")[0])*60)
                        + (Integer.parseInt(map.get(carNumber).split(":")[1]));
                int outTime = (Integer.parseInt(time.split(":")[0])*60)
                        + (Integer.parseInt(time.split(":")[1]));
                timeMap.put(carNumber, timeMap.getOrDefault(carNumber, -fees[0]) + outTime-inTime);
                map.remove(carNumber);
            }else{
                map.put(carNumber, time);
            }
        }

        for(String carNumber : map.keySet()){
            int inTime = (Integer.parseInt(map.get(carNumber).split(":")[0])*60)
                    + (Integer.parseInt(map.get(carNumber).split(":")[1]));
            int outTime = (23*60) + 59;
            timeMap.put(carNumber, timeMap.getOrDefault(carNumber, -fees[0]) + outTime-inTime);
        }

        int[] answer = new int[timeMap.size()];
        int idx = 0;
        for(String carNumber : timeMap.keySet()){
            int over = timeMap.get(carNumber) > 0 ? (int)Math.ceil((double)timeMap.get(carNumber)/fees[2]) : 0;
            answer[idx] = (over*fees[3]) + fees[1];
            idx++;
        }

        return answer;
    }
}