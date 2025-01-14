//https://school.programmers.co.kr/learn/courses/30/lessons/150370

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String term : terms){
            map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
        }

        int today_year = Integer.parseInt(today.split("\\.")[0]);
        int today_month = Integer.parseInt(today.split("\\.")[1]);
        int today_day = Integer.parseInt(today.split("\\.")[2]);

        List<Integer> list = new ArrayList<>();
        int num = 1;
        for(String privacie : privacies){
            String p_date = privacie.split(" ")[0];
            String p_section = privacie.split(" ")[1];

            if(map.containsKey(p_section)){
                int p_year = Integer.parseInt(p_date.split("\\.")[0]);
                int p_month = Integer.parseInt(p_date.split("\\.")[1]);
                int p_day = Integer.parseInt(p_date.split("\\.")[2]);
                p_day += map.get(p_section) * 28 -1;
                while(p_day>28){
                    p_day -= 28;
                    p_month++;
                }
                while(p_month>12){
                    p_month -= 12;
                    p_year++;
                }

                if(today_year > p_year || (today_year >= p_year && today_month > p_month) ||
                        (today_year >= p_year && today_month >= p_month && today_day > p_day)){
                    list.add(num);
                }
            }
            num++;
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}