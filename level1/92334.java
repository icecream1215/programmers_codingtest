//https://school.programmers.co.kr/learn/courses/30/lessons/92334

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report_list, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> map_answer = new HashMap<>();
        HashMap<String, HashSet<String>> map = new HashMap<>();

        for(String id : id_list){
            map_answer.put(id, 0);
        }

        for(String report : report_list){
            String reporter = report.split(" ")[0];
            String bad_user = report.split(" ")[1];
            if(map.containsKey(bad_user)){
                if(map.get(bad_user).contains(reporter))
                    continue;
                HashSet<String> tmp_set = map.get(bad_user);
                tmp_set.add(reporter);
                map.put(bad_user, tmp_set);
            }else{
                HashSet<String> tmp_set = new HashSet<>();
                tmp_set.add(reporter);
                map.put(bad_user, tmp_set);
            }
        }

        for(String bad_user : map.keySet()){
            if(map.get(bad_user).size() >= k){
                for(String id : map.get(bad_user)){
                    map_answer.put(id, map_answer.get(id)+1);
                }
            }
        }

        for(int i = 0; i < id_list.length; i++){
            answer[i] = map_answer.get(id_list[i]);
        }

        return answer;
    }
}