//https://school.programmers.co.kr/learn/courses/30/lessons/49994
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] marker = new int[]{0,0};
        HashSet<String> set = new HashSet<>();
        int direction = 0; // 0 : x축, 1 : y축
        int distance = 0;
        int[] originMarker = new int[]{0,0};
        for(char dir : dirs.toCharArray()){
            originMarker[0] = marker[0];
            originMarker[1] = marker[1];
            switch(dir){
                case 'U':
                    direction = 1; distance = 1; break;
                case 'D':
                    direction = 1; distance = -1; break;
                case 'R':
                    direction = 0; distance = 1; break;
                case 'L':
                    direction = 0; distance = -1; break;
            }
            marker[direction] += distance;
            if(marker[direction] > 5)
                marker[direction] = 5;
            else if (marker[direction] < -5)
                marker[direction] = -5;

            if(originMarker[direction] != marker[direction]) {
                String setKey = "";
                if(originMarker[direction] < marker[direction]) {
                    setKey = originMarker[0] + "," + originMarker[1] + "/" + marker[0] + "," + marker[1];
                } else{
                    setKey = marker[0] + "," + marker[1] + "/" + originMarker[0] + "," + originMarker[1];
                }
                if(!set.contains(setKey)){
                    answer++;
                    set.add(setKey);
                }
            }
        }
        return answer;
    }
}