//https://school.programmers.co.kr/learn/courses/30/lessons/12979
class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int lastEffect = 0;
        int range = 2*w+1;

        for(int station : stations){
            if(station-w > lastEffect+1){
                answer += Math.ceil((double)(station-w-(lastEffect+1))/(2*w+1));
            }
            lastEffect = station + w;
        }

        if (lastEffect < n){
            answer += Math.ceil((double)(n-lastEffect)/(2*w+1));
        }

        return answer;
    }
}