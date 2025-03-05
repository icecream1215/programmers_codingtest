//https://school.programmers.co.kr/learn/courses/30/lessons/148653
class Solution {
    public int solution(int storey) {
        int answer = 0;
        int storeyLength = String.valueOf(storey).length();
        for(int i = 0; i < storeyLength; i++){
            int num = storey%10;
            int nextNum = (storey/10)%10;

            if(num > 5 || (num == 5 && nextNum >=5)){
                answer += 10-num;
                storey += 10-num;
            }else{
                answer += num;
                storey -= num;
            }
            storey /= 10;
        }
        if(storey > 0)
            answer++;
        return answer;
    }
}